public class BlogPostData {
    public static void main(String[] args) {
     //   AuthorName authorName = new AuthorName("John Doe");
     //   Title title = new Title("Lorem Ipsum");
     //   Text text = new Text("Lorem ipsum dolor sit amet.");
     //   PublicationDate publicationDate = new PublicationDate("2000.05.04.");
        BlogPost blogPost = new BlogPost(
                "Jhon Doe",
                "Lorem Ipsum",
                "Lorem ipsum dolor sit amet.",
                "2000.05.04.");
        BlogPost blogPost2 = new BlogPost(
                "Tim Urban",
                "Wait but why",
                "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "2010.10.10.");
        BlogPost blogPost3 = new BlogPost(
                "William Turton",
                "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center " +
                        "of attention. When I asked to take his picture outside one of IBM’s New York " +
                        "City offices, he told me that he wasn’t really into the whole organizer profile thing.",
                "2017.03.28.");

    }
}
