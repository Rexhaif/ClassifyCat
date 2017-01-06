package xyz.rexhaif.classifycat.api;

import xyz.rexhaif.classifycat.Env;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TrainSet {

    static class Entry {
        private String label;
        private String document;
        private long id;

        public Entry(String label, String document, long id) {
            this.label = label;
            this.document = document;
            this.id = id;
        }

        public Entry(String label, String document) {
            new Entry(
                    label,
                    document,
                    Env.HASHFUNC
                            .hashString(document, StandardCharsets.UTF_8)
                            .asLong()
            );
        }

        public String getLabel() {
            return label;
        }

        public String getDocument() {
            return document;
        }

        public long getId() {
            return id;
        }
    }

    private List<Entry> entryList;

    public TrainSet() {
        this.entryList = new CopyOnWriteArrayList<>();
    }
    public TrainSet(List<Entry> entries) {
        this.entryList = new CopyOnWriteArrayList<>(entries);
    }

    public List<Entry> getEntryList() {
        return entryList;
    }
}
