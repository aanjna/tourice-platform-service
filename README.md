# tourice-platform-service


* Hotel Room Upload curl :-

"curl --location 'localhost:8080/api/v1/hotel-rooms/add' \
--form 'photo=@"/Users/abc/image.png"' \
--form 'roomType="Lux"' \
--form 'roomPrice="1000"'"

Functional Req->
Hotel-> View, add, delete, update
HotelRoom -> View,add, delete, update
Search Hotels
Rservation
Cancelation 
Payment
Rooms -> Defined by Room number & assign to customer once booked
Customer View Listing,
Customer Making Reservation,

Listing Service, Booking Service, Inventory, Reservation,
Admin backend - > front dest workers who upload inventory data

Hotel Images- S3, CDN


* if 2 or multiple users trying to book the last room then race condition.
to solve this condition we have below method of transaction management
* 
Begin Transaction
Select for UPDATE available COUNT from Inventory 
  where hotel_id <h1>, and room_type <R1> and date between startDate & endDate
 
    if(available_count < requested_count)
        fail
     
Update inventory 
Set available_count = available_count - requested_count;

create constret available_count - requested_count >0