/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < size(); i++) {
            if (storage[i] != null) {
                storage[i] = null;
            }
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length ; i++) {
            if (storage[i] == null){
                storage[i] = r;
                return;
            }
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null){
                break;
            }
            if (uuid.equals(storage[i].uuid)){
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        Resume[] resumes1 = new Resume[storage.length];
        int j = 0;
        for (int i = 0; i < size(); i++) {
            if (!uuid.equals(storage[i].uuid)){
                resumes1[j] =  storage[i];
                j++;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] resumes = new Resume[size()];
        for (int i = 0; i < resumes.length ; i++) {
            if (storage[i] != null){
                resumes[i]= storage[i];
            }
        }
        return resumes;
    }

    int size() {
        int size = 0;

        for (int i = 0; i < storage.length ; i++) {
            if (storage[i] == null){
                break;
            }
            if (storage[i] != null){
                size++;
            }
        }
        return size;
    }
}
