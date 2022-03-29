## Zadanie 1 - rozwiązywane z wykładowcą

Napisz klasę `User` oraz klasę `UserRepository` implementującą następujące funkcjonalności:
  1. Tworzenie użytkownika.
  2. Edycję użytkownika.
  3. Usuwanie użytkownika.

Napisz klasę testującą dla `UserRepository`.
Napisz to zadanie, używając w pełni metodologii TDD.

Do przechowywania informacji o użytkownikach możesz użyć mapy, np:

```java
public class UserRepository {

    private Map<Integer, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

// pozostałe metody
}
```


## Zadanie 2 - rozwiązywane z wykładowcą

Napisz klasę `Factors` mającą jedną statyczną metodę ```generatePrimeFactors(n)```, która wygeneruje 
wszystkie dzielniki podanej liczby ```n``` w kolejności numerycznej (od najmniejszego).  

Napisz to zadanie, używając w pełni metodologii TDD.  

Wykonuj commit po każdy z 3 etapów procesu, czyli:
- po napisaniu testów
- po napisaniu kodu
- po refaktoryzacji



## Zadanie 3

1. Napisz klasę `Circle` z jedną metodą publiczną ```circleArea(r)``` zwracającą obliczone pole koła dla promienia `$r`.
2. W przypadku podania ujemnej wartości argumentu `r` metoda powinna rzucić wyjątek.
3. Wynik należy zaokrąglić **w górę** do `2` liczb po przecinku.  

Napisz to zadanie, używając w pełni metodologii TDD.  

Wykonuj commit po każdy z 3 etapów procesu czyli:
- po napisaniu testów
- po napisaniu kodu
- po refaktoryzacji




## Zadanie 4

* Napisz, używając techniki TDD, **TaxesOperation** a w niej metodę **calculateVat**. 
* Metoda ma przyjmować:
    * price - cena,
    * vat - stawka podatku VAT jako liczba całkowita.
* Metoda powinna zwrócić kwotę podatku VAT do zapłaty.



## Zadanie 5 - dodatkowe

Napisz, używając techniki TDD, klasę **PasswordUtils** a w niej metodę o nazwie
 **validatePasswordStrength**. 
Funkcja powinna przyjmować hasło (w postaci zwykłego napisu), a zwracać wartość logiczną. 

**Wymagania:**

* hasło ma mieć minimum 7 znaków,
* powinno zawierać:
    * przynajmniej jedną wielką literę,
    * przynajmniej jedną małą literę,
    * przynajmniej jedną cyfrę,
    * przynajmniej jeden znak specjalny z zakresu:
    `!@#$%^&*()_+-={}[]|\:";'<>?,./"`,
* jeśli któryś z warunków hasła (długość lub obecność odpowiednich znaków) nie został spełniony, 
metoda ma zwrócić `false`.


## Zadanie 6 - dodatkowe

Wyobraź sobie, że Twój klient, dla którego pisałeś funkcję w poprzednim zadaniu,
 zażądał zmiany w kodzie:
 
 hasło musi mieć przynajmniej 8 znaków. 
 
 Zgodnie z zasadą TDD, popraw testy, a potem kod programu.
