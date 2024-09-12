package org.example.debris;

import org.springframework.beans.factory.annotation.Autowired;

public class HashCode {
    private final int id;
    // бестолковый но пример хешкода и иквалза. у сущностей из базы он от uuid
    @Autowired
    private UUID_Generator uuidGenerator;

    public HashCode() {
        id = uuidGenerator.getUnicId();
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashCode)) return false;

        return id == ((HashCode) o).id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
