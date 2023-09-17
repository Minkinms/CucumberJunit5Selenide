package config;

public class ProjectDataBase {

    public enum ProjectURLs {
        LOCAL("http://localhost:8080/"),
        PETSHOP_CRM_6("http://192.168.25.122:8000/", "CRM2/", "?desktop_version=ext6");

        private final String uri;
        private String path;
        private String targetPage;

        ProjectURLs(String uri, String path, String targetPage) {
            this.uri = uri;
            this.path = path;
            this.targetPage = targetPage;
        }

        ProjectURLs(String uri, String path) {
            this.uri = uri;
            this.path = path;
        }

        ProjectURLs(String uri) {
            this.uri = uri;
        }

        public String getURI() {
            return this.uri;
        }

        public String getPath() {
            return this.path;
        }

        public String getTargetPage() {
            return this.targetPage;
        }

        public String getURL() {
            return this.uri + this.path;
        }

        public String getUrlMainPage() {
            if (this.targetPage != null) {
                return this.uri + this.path + this.targetPage;
            } else {
                return getURL();
            }
        }

        public String getLocalURI() {
            return LOCAL.uri;
        }

        public String getLocalURL() {
            return LOCAL.uri + this.path;
        }

        public String getLocalUrlMainPage() {
            if (this.targetPage != null) {
                return LOCAL.uri + this.path + this.targetPage;
            } else {
                return getURL();
            }
        }

    }

}
