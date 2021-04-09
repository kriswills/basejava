/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size = 0;

    void clear() {
        size = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                break;
            }
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                size++;
                return;
            }
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                break;
            }
            if (uuid.equals(storage[i].uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        boolean isDeleted = false;

        for (int i = 0; i < storage.length; i++) {
            if (isDeleted) {
                storage[i - 1] = storage[i];
            }
            if (storage[i] == null) {
                break;
            }
            if (uuid.equals(storage[i].uuid)) {
                storage[i] = null;
                isDeleted = true;
                size--;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < resumes.length; i++) {
            if (storage[i] != null) {
                resumes[i] = storage[i];
            }
        }
        return resumes;
    }

    int size() {
        return size;
    }
}