# tourice-platform-service


* Hotel Room Upload curl :-

"curl --location 'localhost:8080/api/v1/hotel-rooms/add' \
--form 'photo=@"/Users/abc/image.png"' \
--form 'roomType="Lux"' \
--form 'roomPrice="1000"'"