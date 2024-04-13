
/**
 * Mock-up library catalog system using an abstract Item class and an ArrayList
 * to contain child classes of Item.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class Main
{
    public static void main() {
        main(null);
    }
    public static void main(String[] args) {
        Catalog library = new Catalog();
        
        Book book1 = new Book();
        Book book2 = new Book();
        
        Periodical journal1 = new Periodical();
        Periodical magazine2 = new Periodical();
        
        book1.setTitle("Ada, a life and a legacy");
        book1.setAuthor("Dorothy Stein");
        book1.setPublisher("MIT Press");
        book1.setPublicationDate(1985);
        book1.setLocalCallNum("QA29.L72 S74 1985");
        book1.setFormat("Print Book");
        book1.setShelvingLoc("General Collection");
        book1.setISBN("026219242X");
        book1.setISBN("9780262192422");
        
        library.addItem(book1);
        
        book2.setTitle("Hamlet");
        book2.setAuthor("Neil Babra");
        book2.setAuthor("William Shakespeare");
        book2.setPublisher("Sparknotes");
        book2.setPublicationDate(2008);
        book2.setLocalCallNum("PN6727.B218 H36 2008");
        book2.setFormat("Print Book");
        book2.setShelvingLoc("Graphic Novels");
        book2.setISBN("1411498739");
        book2.setISBN("9781411498730");
        
        
        library.addItem(book2);
        
        journal1.setTitle("IEEE open journal of the Computer Society");
        journal1.setAuthor("IEEE Computer Society (Sponsor)");
        journal1.setPublisher("Institute of Eletrical and Electronics Engineers");
        journal1.setPublicationDate(2020);
        journal1.setVolume("Volume 1");
        journal1.setFormat("eJournal");
        journal1.setISSN("2644-1268");
        
        library.addItem(journal1);
        
        magazine2.setTitle("Historic preservation: quarterly of the National Council for Historic Sites and Buildings");
        magazine2.setAuthor("National Council for Historic Sites and Buildings");
        magazine2.setAuthor("National Trust for Historic Preservation in the United States");
        magazine2.setPublicationDate(1952);
        magazine2.setVolume("Vol. 4, no. 1 (spring 1952)-v.48, no.3 (May/June 1996)");
        magazine2.setFormat("Print Magazine");
        magazine2.setISSN("0018-2419");
        magazine2.setLocalCallNum("Shelved by title");
        magazine2.setShelvingLoc("Compact Storage - Periodical Print");
        
        library.addItem(magazine2);
        
        System.out.println("Catalog contents: " + library.toString());
    }
    }

