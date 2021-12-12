diff --git a/src/main/java/com/google/devtools/build/lib/syntax/SkylarkDict.java b/src/main/java/com/google/devtools/build/lib/syntax/SkylarkDict.java
index bfb7dca..bdcf336 100644
--- a/src/main/java/com/google/devtools/build/lib/syntax/SkylarkDict.java
+++ b/src/main/java/com/google/devtools/build/lib/syntax/SkylarkDict.java
@@ -181,7 +181,7 @@
    * @param valueType the expected class of values
    * @param description a description of the argument being converted, or null, for debugging
    */
-  public static <K, V> SkylarkDict<K, V> castSkylarkDictOrNoneToDict(
+  public static <K, V> Map<K, V> castSkylarkDictOrNoneToDict(
       Object obj, Class<K> keyType, Class<V> valueType, @Nullable String description)
       throws EvalException {
     if (EvalUtils.isNullOrNone(obj)) {
