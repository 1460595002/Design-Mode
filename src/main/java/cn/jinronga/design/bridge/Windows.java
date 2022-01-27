package cn.jinronga.design.bridge;

//Windows版本
public class Windows extends OperatingSystemVersion {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}