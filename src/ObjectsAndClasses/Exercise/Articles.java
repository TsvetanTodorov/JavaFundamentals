package ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class Articles {


    static class Article {
        private String title;
        private String content;
        private String author;

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] articleParts = scanner.nextLine().split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(": ")[0];
            String newValue = command.split(": ")[1];

            switch (commandName) {
                case "Edit" -> article.setContent(newValue);
                case "ChangeAuthor" -> article.setAuthor(newValue);
                case "Rename" -> article.setTitle(newValue);
            }
        }

        System.out.println(article);


    }
}
