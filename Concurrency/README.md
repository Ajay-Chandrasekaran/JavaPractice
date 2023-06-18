# NOTES

### Problesm with threads
* Iconsistent data - dealt with Syncronization

### General Rules
* Thread that blocks (calls sleep / wait) should own the object's lock

### Syncronization
* Can be done with Syncronized method / Statements
* when calling a syncronized method that Object's intrinsic lock is acquired, and it is released when the method returns
* For static fields, the Class' lock (or monitor) is acquired & released

### Gaurded Block
* Poll a condition and then block
* wait() causes current thread to wait until notifiaction
* blocked thread can be resumed by a notification
* Notification need not be the specific one we are looking for, so check it in a loop

```java
public synchronized void guardedJoy() {
    // This guard only loops once for each special event, which may not
    // be the event we're waiting for.
    while(!joy) {
        try {
            wait();
        } catch (InterruptedException e) {}
    }
    System.out.println("Joy and efficiency have been achieved!");
}
```
