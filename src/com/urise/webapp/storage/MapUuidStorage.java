package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.*;

// TODO implement
// TODO: create new MapStorage class with  Search key not uuid
public class MapUuidStorage extends AbstractStorage {
    private Map<String, Resume> map = new HashMap<>();

    @Override
    protected String getSearchKey(String uuid) {
        for (Map.Entry<String, Resume> entry : map.entrySet()) {
            if (map.get(uuid).getUuid().equals(uuid)) {
                return uuid;
            }
        }
        return null;
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        map.put((String) searchKey, r);
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return (String) searchKey != null;
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        map.put((String) searchKey, r);
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return map.get((String) searchKey);
    }

    @Override
    protected void doDelete(Object searchKey) {
        map.remove((String) searchKey);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<Resume> getAllSorted() {
        List<Resume> list = new ArrayList<Resume>(map.values());
        Collections.sort(list, RESUME_COMPARATOR);
        return list;
    }

/*
    @Override
    public Resume[] getAll() {
        return new Resume[0];
    }*/


    @Override
    public int size() {
        return map.size();
    }
}
