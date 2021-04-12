package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size = 0;

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
            size = 0;
        }
    }

    public void update(Resume r) {
        // check if resume present
        int i = getIndex(r.getUuid());
        if (i != -1) {
            storage[i] = r;
        }
    }

    public void save(Resume r) {
        // check if resume do not
        if (size >= storage.length) {
            System.out.println("Overflow");
            return;
        }
        int i = getIndex(r.getUuid());
        if (i != -1) {
            System.out.println("Resume exists");
            return;
        }
        storage[size] = r;
        size++;


    }

    public Resume get(String uuid) {
        // check if the resume exists
        int i = getIndex(uuid);
        if (i != -1) {
            return storage[i];
        } else {
            return null;
        }
    }

    public void delete(String uuid) {
        //check if resume exists
        int i = getIndex(uuid);
        if (i == -1) {
            System.out.println("do not exist");
        } else {
            storage[i] = storage[size - 1];
            storage[size - i] = null;
            size--;
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    public int size() {
        return size;
    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return i;
            }
        }
        System.out.println("not found");
        return -1;
    }
}