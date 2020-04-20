public class FileDownloadProxy implements Downloader {
    @Override
    public void download(String UserAgent, String url, String dest){
        FileDownloader fileDownload = new FileDownloader();
        fileDownload.download(UserAgent, url, dest);
    }
}
