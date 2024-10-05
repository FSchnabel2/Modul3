# Allgemeine Dokumentation

## Einführung
Die Medienbibliothek ist eine Softwareanwendung zur Verwaltung digitaler Medien, die Benutzern ermöglicht, eBooks und Filme effizient zu organisieren, zu durchsuchen und hinzuzufügen. Diese Anwendung richtet sich an Leser und Filmbegeisterte, die eine übersichtliche und benutzerfreundliche Plattform suchen, um ihre Medien zu verwalten.

## Inhalte
### Klassen:
1. eBook: Repräsentiert digitale Bücher mit Eigenschaften wie Titel, Autor, ISBN, Seitenanzahl und Auflage. Erbt von der Klasse Medium.
2. Film: Repräsentiert Filme mit Attributen wie Titel, Regisseur, Spielzeit, und Verfügbarkeitsoptionen für UHD und HD. Auch diese Klasse erbt von Medium.
3. Genre: Stellt die verschiedenen Genres dar, die einem Medium zugeordnet werden können.
4. Kommandozeilenmenue: Diese Klasse enthält die Benutzeroberfläche der Anwendung in Form eines Menüs, das es dem Benutzer ermöglicht, verschiedene Funktionen der Medienbibliothek zu nutzen, wie das Anzeigen aller Medien, das Suchen eines Mediums und das Hinzufügen neuer Medien.
5. Main: Die Hauptklasse, die den Einstiegspunkt der Anwendung darstellt.
6. Medienbibliothek: Verwaltet die Sammlung von Medienobjekten. Sie enthält Methoden zum Hinzufügen, Suchen und Anzeigen von Medien.
7. Medium: Die abstrakte Basisklasse für alle Medien, die gemeinsame Attribute und Methoden definiert.
8. Urheber: Diese Klasse könnte Autoren oder Regisseure darstellen, die den Medien zugeordnet sind (Details über diese Klasse sind nicht im Code erwähnt, könnten aber für die Erweiterung der Anwendung nützlich sein).

### Vererbungshierarchie
```mermaid
classDiagram
    class Medium {
        -String titel
        -String kommentar
        -LocalDate erscheinungsdatum
        -Genre genre
        +Medium(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre)
        #String anzeigen()
        #String getMediumInfo()
        +String getTitel()
        +String toString()
    }

    class eBook {
        -String autor
        -String ISBN
        -int seitenanzahl
        -String auflage
        +eBook(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, String autor, String ISBN, int seitenanzahl, String auflage)
        #String anzeigen()
        +String toString()
    }

    class Film {
        -String regisseur
        -int spielzeit
        -boolean uhd
        -boolean hd
        +Film(String titel, String kommentar, LocalDate erscheinungsdatum, Genre genre, String regisseur, int spielzeit, boolean uhd, boolean hd)
        #String anzeigen()
        +String toString()
    }

    Medium <|-- eBook
    Medium <|-- Film

```

## Fazit
Die Medienbibliothek ist ein flexibles und erweiterbares System, das eine klare Struktur zur Verwaltung von eBooks und Filmen bietet. Die Verwendung einer Vererbungshierarchie ermöglicht eine effiziente Verwaltung von gemeinsamen und spezifischen Eigenschaften der Medien. Die Implementierung eines Kommandozeilenmenüs sorgt für eine benutzerfreundliche Interaktion.