diff --git a/src/java/org/apache/commons/lang/enum/Enum.java b/src/java/org/apache/commons/lang/enum/Enum.java
index f7bb5d6..7ee8528 100644
--- a/src/java/org/apache/commons/lang/enum/Enum.java
+++ b/src/java/org/apache/commons/lang/enum/Enum.java
@@ -198,18 +198,19 @@
  *
  * @author Stephen Colebourne
  * @author Chris Webb
+ * @author Mike Bowler
  * @since 1.0
- * @version $Id: Enum.java,v 1.8 2003/02/04 18:30:07 scolebourne Exp $
+ * @version $Id: Enum.java,v 1.9 2003/02/04 18:42:50 scolebourne Exp $
  */
 public abstract class Enum implements Comparable, Serializable {
     /**
      * An empty map, as JDK1.2 didn't have an empty map
      */
-    private static final Map EMPTY_MAP = Collections.unmodifiableMap(new HashMap());
+    private static final Map EMPTY_MAP = Collections.unmodifiableMap(new HashMap(1));
     /**
      * Map, key of class name, value of Entry.
      */
-    private static final Map cEnumClasses = new HashMap();
+    private static final Map cEnumClasses = new HashMap(61);
     /**
      * The string representation of the Enum.
      */
@@ -220,7 +221,7 @@
      */
     private static class Entry {
         /** Map of Enum name to Enum */
-        final Map map = new HashMap(50);
+        final Map map = new HashMap(61);
         /** List of Enums in source code order */
         final List list = new ArrayList(25);
 
@@ -240,7 +241,7 @@
     protected Enum(String name) {
         super();
         if (name == null || name.length() == 0) {
-            throw new IllegalArgumentException("The Enum name must not be empty");
+            throw new IllegalArgumentException("The Enum name must not be empty or null");
         }
         iName = name;
         Class enumClass = Enum.getEnumClass(getClass());
