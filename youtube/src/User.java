public class User {
        protected String username;
        private String email;
        private String password;
        private String name;
        private String surname;
        private int age;

        public User() {
            this.username = "defaultUser";
            this.email = "";
        }

        public User(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }
}
