Aplikacja Kasa Fiskalna
=======================
Założenia:
- w Spring Boot
- obsługa przez http
- powinna działać ze Swagger-em
- Funkcjonalność:
  * dodanie produktu
  * podliczenie cen

Obsługiwane request-y http:
Requesty przez strony html:
- /web/produkt_utworz
  * GET - wyswietla formatke do utworzenia nowego produktu (nazwa, cena)
  * POST Form - utworzenie nowego produktu
- /web/produkty
  * GET - wyswietlenie wszystkich produktow
- /web/zakup_utworz
  * GET - wyswietla formatke do utworzenia nowego zakupu (produkty z listy i ilości)
  * POST Form - utworzenie nowego zakupu
- /web/zakupy
  * POST Form - uwtorzenie nowego zakupy (lista produktów)
  * GET - wyswietlenie wszystkich zakupów
Dodatkowo podobnie jak wyżej tylko wysyłanie i odbieranie informacji przez JSON
- /api/produkt_utworz
  * POST json - utworzenie nowego produktu
- /api/produkty
  * GET - uzyskanie listy produktów w JSON
- /api/zakup_utworz
  * POST json - utworzenie nowego zakupu
- /api/zakupy
  * GET - uzyskanie listy zakupow w JSON
- /api/podsumowanie
  * GET - uzyskanie podsumowanie w JSON (ile zakupów i ich suma)