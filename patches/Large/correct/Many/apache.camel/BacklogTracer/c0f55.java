diff --git a/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java b/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java
index fa0dcda..15f9cd2 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java
@@ -43,16 +43,16 @@
  * This tracer allows to store message tracers per node in the Camel routes. The tracers
  * is stored in a backlog queue (FIFO based) which allows to pull the traced messages on demand.
  */
-public class BacklogTracer extends ServiceSupport implements InterceptStrategy {
+public final class BacklogTracer extends ServiceSupport implements InterceptStrategy {
 
-    // lets limit the tracer to 100 thousand messages in total
-    public static final int MAX_BACKLOG_SIZE = 100 * 1000;
+    // lets limit the tracer to 10 thousand messages in total
+    public static final int MAX_BACKLOG_SIZE = 10 * 1000;
     private static final Logger LOG = LoggerFactory.getLogger(BacklogTracer.class);
     private final CamelContext camelContext;
     private boolean enabled;
     private final AtomicLong traceCounter = new AtomicLong(0);
     // use a queue with a upper limit to avoid storing too many messages
-    private final Queue<BacklogTracerEventMessage> queue = new LinkedBlockingQueue<>(MAX_BACKLOG_SIZE);
+    private final Queue<BacklogTracerEventMessage> queue = new LinkedBlockingQueue<BacklogTracerEventMessage>(MAX_BACKLOG_SIZE);
     // how many of the last messages to keep in the backlog at total
     private int backlogSize = 1000;
     private boolean removeOnDump = true;
@@ -262,7 +262,7 @@
     }
 
     public List<BacklogTracerEventMessage> dumpTracedMessages(String nodeId) {
-        List<BacklogTracerEventMessage> answer = new ArrayList<>();
+        List<BacklogTracerEventMessage> answer = new ArrayList<BacklogTracerEventMessage>();
         if (nodeId != null) {
             for (BacklogTracerEventMessage message : queue) {
                 if (nodeId.equals(message.getToNode()) || nodeId.equals(message.getRouteId())) {
@@ -291,7 +291,7 @@
     }
 
     public List<BacklogTracerEventMessage> dumpAllTracedMessages() {
-        List<BacklogTracerEventMessage> answer = new ArrayList<>();
+        List<BacklogTracerEventMessage> answer = new ArrayList<BacklogTracerEventMessage>();
         answer.addAll(queue);
         if (isRemoveOnDump()) {
             queue.clear();
