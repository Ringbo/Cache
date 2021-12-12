diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/notations/TypedNotationParser.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/notations/TypedNotationParser.java
index f06fdff..77696d8 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/notations/TypedNotationParser.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/notations/TypedNotationParser.java
@@ -19,11 +19,11 @@
 /**
  * by Szczepan Faber, created at: 11/9/11
  */
-public abstract class TypedNotationParser<Input, Output> implements NotationParser<Output> {
+public abstract class TypedNotationParser<N, T> implements NotationParser<T> {
 
-    private final Class<Input> typeToken;
+    private final Class<N> typeToken;
 
-    public TypedNotationParser(Class<Input> typeToken) {
+    public TypedNotationParser(Class<N> typeToken) {
         assert typeToken != null : "typeToken cannot be null";
         this.typeToken = typeToken;
     }
@@ -32,10 +32,10 @@
         return typeToken.isAssignableFrom(notation.getClass());
     }
 
-    public Output parseNotation(Object notation) {
+    public T parseNotation(Object notation) {
         assert canParse(notation) : "This parser only parses instances of " + typeToken.getName();
         return parseType(typeToken.cast(notation));
     }
 
-    abstract public Output parseType(Input notation);
+    abstract public T parseType(N notation);
 }
