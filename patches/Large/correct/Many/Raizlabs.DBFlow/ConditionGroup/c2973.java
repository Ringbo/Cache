diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/ConditionGroup.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/ConditionGroup.java
index a92ea69..9a78b61 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/ConditionGroup.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/ConditionGroup.java
@@ -35,14 +35,14 @@
     private boolean allCommaSeparated;
     private boolean useParenthesis = true;
 
-    ConditionGroup(NameAlias columnName) {
+    protected ConditionGroup(NameAlias columnName) {
         super(columnName);
 
         // default is AND
         separator = Operation.AND;
     }
 
-    public ConditionGroup() {
+    protected ConditionGroup() {
         this(null);
     }
 
