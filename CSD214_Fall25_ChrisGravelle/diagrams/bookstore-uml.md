```mermaid
classDiagram
class abstract{
<<abstract>>
Editable
-Scanner input
+String getInput(String)
+String getInput(int)
+String getInput(double)
+String getInput(boolean)
+String getInput(Date)
+String getInput(Enum)
+edit()
+initialize()
 }
 class interface {
 <<interface>>
 SaleableItem
 
+sellItem()
+getPrice()
 }
 class interface { 
 <<interface>>
 Serializable
 }
  class cashTill {
        +sellItem(SaleableItem item)
    }
    
    class SaleableItem {
        +sellItem()
        +getPrice()
    }
    <<interface>> SaleableItem
       
    class Publication {
        -String title
        -double price
        -int copies
        -int id
        +sellItem()
        +getPrice()
        +publication()
        +publication(String title, double price, int copies)
        +toString()
        +equals()
        +hashCode()
    }
    <<abstract>> Publication
    Publication ..|> SaleableItem
    Publication ..|> Serializable
    Publication ..|> Editable
    
    class Ticket {
        -int id
        -String description
        -double price
        +getPrice()
        +sellItem()
        +edit()
        +initalize()
    }
 <<abstract>> Ticket
 Ticket ..|> SaleableItem
 Ticket ..|> Serializable
 Ticket ..|> Editable
 class Editable {
 +String getInput(param: String)
 +String getInput(param: int)
 +String getInput(param: double)
 +String getInput(param: boolean)
 +String getInput(param: LocalDate)
 +edit()
 +initialize()
 }
 <<abstract>> Editable 
 
  class Book {-String author
  +edit()
  +initialize()
  +sellItem()
  +Book()
  +Book(String author)
  +Book(String author, String title, double price, int copies)
  +toString()
  +equals()
  +hashCode()
  }
  class Magazine {
  -int orderQty
  -java.util.Date currentIssue
  +Magazine(int orderQty, Date currentIssue, String title, double price, int copies)
  +edit()
  +initialize()
  +sellItem()
  }
  
  class publication {
  Publication
  -String title
  -double price 
  -int copies
  
  +getPrice()
  +Publication()
  +Publication(String title, double price, int copies)
  +toSTring()
  +equals
  +hashCode()
  }
  publication ..|> ticket
  class ticket { 
  }
  class Discmag { 
  -boolean hasDisc
  +edit()
  +initialize()
  +sellItem()
  +DiscMag()
  +DiscMag(boolean, has Disc, int orderQty, Date currentIssue, String title, double price, int copies)
  } 
  DiscMag ..|> Magazine

    class Serializable {
    }
    <<interface>> Serializable
  
  
  