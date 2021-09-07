package oop.tasks.task5io;

import java.io.File;

public class DirectoryViewer {

    private final File file;

    public DirectoryViewer (String path) {
        this.file = new File(path);
    }

    public DirectoryViewer(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public void viewer () {
        viewer(getFile());
    }

    protected void viewer(File originalFolder) {
        if (originalFolder.isDirectory()) {
            System.out.println("Viewing: " + originalFolder.getAbsolutePath());
            File [] directoryFiles = originalFolder.listFiles();
            if (directoryFiles != null) {
                for (File checkedFile : directoryFiles) {
                    if (checkedFile.isDirectory()) {
                        viewer(checkedFile);
                    } else {
                        System.out.println("Viewing: " + checkedFile.getAbsolutePath());
                    }
                }
            }
        }
    }
}
