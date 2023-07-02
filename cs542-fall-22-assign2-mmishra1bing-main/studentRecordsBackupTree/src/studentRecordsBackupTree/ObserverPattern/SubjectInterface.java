package studentRecordsBackupTree.ObserverPattern;

import studentRecordsBackupTree.bst.Node;

public interface SubjectInterface {

     void registerObserver(Node observer);
     void unregisterObserver(Node observer);
     void notifyObserver();
}
