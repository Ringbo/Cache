diff --git a/clients/unshaded/src/main/java/tachyon/client/keyvalue/KeyValueWorkerClient.java b/clients/unshaded/src/main/java/tachyon/client/keyvalue/KeyValueWorkerClient.java
index 16d9b08..95b96c6 100644
--- a/clients/unshaded/src/main/java/tachyon/client/keyvalue/KeyValueWorkerClient.java
+++ b/clients/unshaded/src/main/java/tachyon/client/keyvalue/KeyValueWorkerClient.java
@@ -33,13 +33,12 @@
 import tachyon.util.network.NetworkAddressUtils;
 
 /**
- * The client talks to a key-value worker server. It keeps sending keep alive message to the worker
- * server.
+ * The client talks to a key-value worker server.
  *
  * Since {@link KeyValueWorkerClientService.Client} is not thread safe, this class has to guarantee
  * thread safety.
  */
-public class KeyValueWorkerClient extends ClientBase {
+public final class KeyValueWorkerClient extends ClientBase {
   private static final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_TYPE);
 
   private KeyValueWorkerClientService.Client mClient = null;
@@ -75,7 +74,7 @@
   }
 
   /**
-   * Notifies the worker to checkpoint the file asynchronously.
+   * Gets the value of a given {@code key}.
    *
    * @param blockId The id of the block
    * @return ByteBuffer of value, or null if not found
