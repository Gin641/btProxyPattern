import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloader implements Downloader {
    @Override
    public void download(String UserAgent, String url, String dest){
        try {
            URLConnection urlConnection = new URL(url).openConnection();
            urlConnection.setRequestProperty("User Agent",UserAgent);
            urlConnection.setUseCaches(false);
            Files.copy(urlConnection.getInputStream(), Paths.get(dest));
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
