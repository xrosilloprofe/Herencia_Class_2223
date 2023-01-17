package es.ieslavereda.multimedia;

public enum Formato {
    WAV(".wav"), MP3(".mp3"), MIDI(".midi"), AVI(".avi"),
    MOV(".mov"), MPG(".mpg"), CDAUDIO(".cda"), DVD(".dvd");

    private final String extension;
    Formato(String extension) {
        this.extension = extension;
    }
    public String getExtension() {
        return extension;
    }
}
