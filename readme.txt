Aplikacja Kasa Fiskalna
=======================
Założenia:
- w Spring Boot
- obsługa przez http
- powinna działać ze Swagger-em
- Funkcjonalność:
  * dodanie produktu (nazwa i cena)
  * podliczenie ceny (suma wszystkich produktow)

Obsługiwane request-y http:
Requesty przez strony html:
- /web/produktUtworz
  * GET - wyswietla formatke do utworzenia nowego produktu (nazwa, cena)
  * POST Form - utworzenie nowego produktu
- /web/products
  * GET - wyswietlenie wszystkich produktow
- /web/podsumowanie
  * GET - uzyskanie podsumowania na stronie HTML (ile produktow i ich suma)
Dodatkowo podobnie jak wyżej tylko wysyłanie i odbieranie informacji przez JSON
- /api/produktUtworz
  * POST json - utworzenie nowego produktu
- /api/products
  * GET - uzyskanie listy produktów w JSON
- /api/podsumowanie
  * GET - uzyskanie podsumowania w JSON (ile produktow i ich suma)

WIP:
Struktury danych:
- Produkt (nazwa, cena) - class Product
