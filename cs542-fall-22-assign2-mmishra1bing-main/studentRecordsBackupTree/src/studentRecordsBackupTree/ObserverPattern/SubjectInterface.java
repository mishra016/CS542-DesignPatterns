package studentRecordsBackupTree.ObserverPattern;

import studentRecordsBackupTree.bst.Node;

public interface SubjectInterface {

    public void registerObserver(Node observer);
    public void unregisterObserver(Node observer);
    public void notifyObserver();


}
