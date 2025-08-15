/******************Life cycle of the Thread************
 * ->===new=== (the thread is created using the 
 * Thread t1=new Thread())
 * ->===runnable=== t1.start();
 * the thread is ready to start waiting for the another threads to complete..
 * ->====running===
 * The thread is strated and ready to run the run method..
 * 
 * 
 * ====wait()====
 * waiting to accquire the join() example(waiting at the restaurant),waiting indefenitly
 * another thread signal like the join() or the wait()
 * 
 * 
 * ===blocked===
 * waiting to accquire the lock or the  synchronization.(the resource can be blocked it need 
 * to complete untill the that thread complete)
 * 
 * 
 * ==terminated===
 * the thread is terminated due to the race condition..
 * 
 * 
 * 
 * in the real life example
 * 
 * Imagine a taxi (thread) and its different states while operating:

New (Born) State

Example: A new taxi is manufactured and ready at the garage but hasn’t started operating yet.

In Code: Thread t = new Thread(); (created but not started).

Runnable (Ready) State

Example: The taxi is on the road, waiting for a passenger (waiting for CPU time).

In Code: t.start() (thread is ready to run but depends on the scheduler).

Running State

Example: The taxi is actively carrying a passenger (executing its task).

In Code: When the scheduler picks the thread, it executes run().

Blocked/Waiting State

Example: The taxi is waiting at a traffic signal (paused due to external factors).

In Code: wait(), sleep(), or waiting for I/O.

Terminated (Dead) State

Example: The taxi completes its trip and goes off-duty.

In Code: When run() method completes execution.

Visual Representation:
text
New (Taxi manufactured)  
   ↓  
Runnable (Waiting for passenger)  
   ↓  
Running (Carrying passenger)  
   ↓  
Blocked (Waiting at signal) → Runnable → Running → Terminated (Trip ends)
Key Takeaways:
Just like a taxi moves between different states (idle, running, waiting), a thread transitions between states.

The OS (like a taxi dispatcher) decides when a thread runs.

Threads can pause (sleep(), wait()) or resume based on conditions.

This analogy helps understand how threads work dynamically in a system! 🚖💻
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class Multi04 {
    public static void main(String[] args) {
        
    }
    
}
