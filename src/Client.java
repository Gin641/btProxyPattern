public class Client {
    public static void main(String[] args) {
        String url = "https://data25.chiasenhac.com/downloads/2076/1/2075616-275ebdc7/32/Vung%20Ky%20Uc%20-%20Chillies.m4a";
        String UserAgent = "Mozilla/5.0 Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11";
        String destination = "C:\\Gin\\module 2\\Structural Design Pattern\\btProxy Pattern\\src\\test.m4a";
        FileDownloadProxy fileDownloadProxy = new FileDownloadProxy();
        fileDownloadProxy.download(UserAgent, url, destination);
    }
}
