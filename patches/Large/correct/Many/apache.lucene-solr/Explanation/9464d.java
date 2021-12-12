diff --git a/lucene/core/src/java/org/apache/lucene/search/Explanation.java b/lucene/core/src/java/org/apache/lucene/search/Explanation.java
index c554861..9f767ca 100644
--- a/lucene/core/src/java/org/apache/lucene/search/Explanation.java
+++ b/lucene/core/src/java/org/apache/lucene/search/Explanation.java
@@ -25,7 +25,7 @@
 import java.util.Objects;
 
 /** Expert: Describes the score computation for document and query. */
-public class Explanation {
+public final class Explanation {
 
   /**
    * Create a new explanation for a match.
@@ -51,14 +51,14 @@
    * Create a new explanation for a document which does not match.
    */
   public static Explanation noMatch(String description, Collection<Explanation> details) {
-    return new Explanation(false, 0f, description, Collections.emptyList());
+    return new Explanation(false, 0f, description, details);
   }
 
   /**
    * Create a new explanation for a document which does not match.
    */
   public static Explanation noMatch(String description, Explanation... details) {
-    return new Explanation(false, 0f, description, Collections.emptyList());
+    return new Explanation(false, 0f, description, Arrays.asList(details));
   }
 
   private final boolean match;                          // whether the document matched
@@ -90,11 +90,7 @@
   /** A description of this explanation node. */
   public String getDescription() { return description; }
 
-  /**
-   * A short one line summary which should contain all high level
-   * information about this Explanation, without the "Details"
-   */
-  protected String getSummary() {
+  private String getSummary() {
     return getValue() + " = " + getDescription();
   }
   
@@ -108,7 +104,8 @@
   public String toString() {
     return toString(0);
   }
-  protected String toString(int depth) {
+
+  private String toString(int depth) {
     StringBuilder buffer = new StringBuilder();
     for (int i = 0; i < depth; i++) {
       buffer.append("  ");
