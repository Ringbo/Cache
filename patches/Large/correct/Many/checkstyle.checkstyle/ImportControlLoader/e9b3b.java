diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
index 6cbd4ac..c3fea74 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
@@ -70,8 +70,8 @@
     /** Qualified name for element 'allow'. */
     private static final String ALLOW_ELEMENT_NAME = "allow";
 
-    /** Used to hold the {@link PkgControl} objects. */
-    private final Deque<PkgControl> stack = new ArrayDeque<>();
+    /** Used to hold the {@link ImportControl} objects. */
+    private final Deque<ImportControl> stack = new ArrayDeque<>();
 
     static {
         DTD_RESOURCE_BY_ID.put(DTD_PUBLIC_ID_1_0, DTD_RESOURCE_NAME_1_0);
@@ -97,12 +97,12 @@
         if ("import-control".equals(qName)) {
             final String pkg = safeGet(attributes, PKG_ATTRIBUTE_NAME);
             final boolean regex = containsRegexAttribute(attributes);
-            stack.push(new PkgControl(pkg, regex));
+            stack.push(new ImportControl(pkg, regex));
         }
         else if (SUBPACKAGE_ELEMENT_NAME.equals(qName)) {
             final String name = safeGet(attributes, "name");
             final boolean regex = containsRegexAttribute(attributes);
-            stack.push(new PkgControl(stack.peek(), name, regex));
+            stack.push(new ImportControl(stack.peek(), name, regex));
         }
         else if (ALLOW_ELEMENT_NAME.equals(qName) || "disallow".equals(qName)) {
             // Need to handle either "pkg" or "class" attribute.
@@ -148,10 +148,10 @@
     /**
      * Loads the import control file from a file.
      * @param uri the uri of the file to load.
-     * @return the root {@link PkgControl} object.
+     * @return the root {@link ImportControl} object.
      * @throws CheckstyleException if an error occurs.
      */
-    public static PkgControl load(final URI uri) throws CheckstyleException {
+    public static ImportControl load(final URI uri) throws CheckstyleException {
         final InputStream inputStream;
         try {
             inputStream = uri.toURL().openStream();
@@ -170,10 +170,10 @@
      * Loads the import control file from a {@link InputSource}.
      * @param source the source to load from.
      * @param uri uri of the source being loaded.
-     * @return the root {@link PkgControl} object.
+     * @return the root {@link ImportControl} object.
      * @throws CheckstyleException if an error occurs.
      */
-    private static PkgControl load(final InputSource source,
+    private static ImportControl load(final InputSource source,
         final URI uri) throws CheckstyleException {
         try {
             final ImportControlLoader loader = new ImportControlLoader();
@@ -190,9 +190,9 @@
     }
 
     /**
-     * @return the root {@link PkgControl} object loaded.
+     * @return the root {@link ImportControl} object loaded.
      */
-    private PkgControl getRoot() {
+    private ImportControl getRoot() {
         return stack.peek();
     }
 
