package com.pedroborgesalves.javadesignpatterns.command;

/**
 * <h1>Command Pattern</h1>
 * <p>
 * The intent of the Command Design Pattern is to encapsulate a request as an
 * object, thereby letting the developer to parameterise clients with different
 * requests, queue or log requests, and support undoable operations.</p>
 * <p>
 * - Parameterise objects by an action to perform.</p>
 * <p>
 * - Specify, queue, and execute requests at different times. A Command object
 * can have a lifetime independent of the original request. If the receiver of a
 * request can be represented in an address space-independent way, then you can
 * transfer a command object for the request to a different process and fulfill
 * the request there.</p>
 * <p>
 * - Support undo. The Command’s Execute operation can store state for reversing
 * its effects in the command itself. The Command interface must have an added
 * Un-execute operation that reverses the effects of a previous call to Execute.
 * Executed commands are stored in a history list. Unlimited-level undo and redo
 * is achieved by traversing this list backwards and forwards calling Un-execute
 * and Execute, respectively.</p>
 * <p>
 * - Support logging changes so that they can be reapplied in case of a system
 * crash. By augmenting the Command interface with load and store operations,
 * you can keep a persistent log of changes. Recovering from a crash involves
 * reloading logged commands from disk and re-executing them with the Execute
 * operation.</p>
 * <p>
 * Structure a system around high-level operations built on primitives
 * operations. Such a structure is common in information systems that support
 * transactions. A transaction encapsulates a set of changes to data. The
 * Command pattern offers a way to model transactions. Commands have a common
 * interface, letting you invoke all transactions the same way. The pattern also
 * makes it easy to extend the system with new transactions.</p>
 *
 */
public class CommandDemo {

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        ThreadPool pool = new ThreadPool(10);
        Email email = null;
        EmailJob emailJob = new EmailJob();
        Sms sms = null;
        SmsJob smsJob = new SmsJob();
        FileIO fileIO = null;;
        FileIOJob fileIOJob = new FileIOJob();
        Logging logging = null;
        LoggingJob logJob = new LoggingJob();
        for (int i = 0; i < 5; i++) {
            email = new Email();
            emailJob.setEmail(email);
            sms = new Sms();
            smsJob.setSms(sms);
            fileIO = new FileIO();
            fileIOJob.setFileIO(fileIO);
            logging = new Logging();
            logJob.setLogging(logging);
            pool.addJob(emailJob);
            pool.addJob(smsJob);
            pool.addJob(fileIOJob);
            pool.addJob(logJob);
        }
        pool.shutdownPool();
    }
}
