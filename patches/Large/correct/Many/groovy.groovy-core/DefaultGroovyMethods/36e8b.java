diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index f368bbf..7da69c3 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -2699,24 +2699,28 @@
      *          y is the first string in the matched group
      *          z is the second string in the matched group
      * </pre>
+     * <p>Note that unlike String.replaceAll(String pattern, String replacement), where the replacement string
+     * treats '$' and '\' specially (for group substitution), the result of the closure is converted to a string
+     * and that value is used literally for the replacement.</p>
      *
      * @param self    a String
      * @param regex   the capturing regex
      * @param closure the closure to apply on each captured group
      * @return a String with replaced content
      * @since 1.0
+     * @see java.util.regex.Matcher.quoteReplacement(String)
      */
     public static String replaceAll(final String self, final String regex, final Closure closure) {
         final Matcher matcher = Pattern.compile(regex).matcher(self);
         if (matcher.find()) {
-            final StringBuffer sb = new StringBuffer();
+            final StringBuffer sb = new StringBuffer(self.length() + 16);
             do {
                 int count = matcher.groupCount();
                 List groups = new ArrayList();
                 for (int i = 0; i <= count; i++) {
                     groups.add(matcher.group(i));
                 }
-                final String replacement = String.valueOf(closure.call(groups.toArray()));
+                final String replacement = InvokerHelper.toString(closure.call(groups.toArray()));
                 matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
             } while (matcher.find());
             matcher.appendTail(sb);
