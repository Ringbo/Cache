diff --git a/elasticsearch/x-pack/shield/src/test/java/org/elasticsearch/shield/authz/indicesresolver/DefaultIndicesResolverTests.java b/elasticsearch/x-pack/shield/src/test/java/org/elasticsearch/shield/authz/indicesresolver/DefaultIndicesResolverTests.java
index 3293687..3a66f22 100644
--- a/elasticsearch/x-pack/shield/src/test/java/org/elasticsearch/shield/authz/indicesresolver/DefaultIndicesResolverTests.java
+++ b/elasticsearch/x-pack/shield/src/test/java/org/elasticsearch/shield/authz/indicesresolver/DefaultIndicesResolverTests.java
@@ -490,11 +490,11 @@
         request.indices("foo*");
         Set<String> indices = defaultIndicesResolver.resolve(user, GetAliasesAction.NAME, request, metaData);
         //the union of all resolved indices and aliases gets returned, based on indices and aliases that user is authorized for
-        String[] expectedIndices = new String[]{"alias1", "foofoo", "foofoobar"};
+        String[] expectedIndices = new String[]{"alias1", "foofoo", "foofoo-closed", "foofoobar"};
         assertThat(indices.size(), equalTo(expectedIndices.length));
         assertThat(indices, hasItems(expectedIndices));
         //wildcards get replaced on each single action
-        assertThat(request.indices(), arrayContaining("foofoobar", "foofoo"));
+        assertThat(request.indices(), arrayContaining("foofoobar", "foofoo", "foofoo-closed"));
         assertThat(request.aliases(), arrayContaining("alias1"));
     }
 
@@ -520,19 +520,19 @@
         request.aliases("alias1");
         Set<String> indices = defaultIndicesResolver.resolve(user, GetAliasesAction.NAME, request, metaData);
         //the union of all resolved indices and aliases gets returned
-        String[] expectedIndices = new String[]{"bar", "foofoobar", "foofoo", "alias1"};
+        String[] expectedIndices = new String[]{"bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed", "alias1"};
         assertThat(indices.size(), equalTo(expectedIndices.length));
         assertThat(indices, hasItems(expectedIndices));
-        String[] replacedIndices = new String[]{"bar", "foofoobar", "foofoo"};
+        String[] replacedIndices = new String[]{"bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed"};
         //_all gets replaced with all indices that user is authorized for
         assertThat(request.indices(), arrayContaining(replacedIndices));
         assertThat(request.aliases(), arrayContaining("alias1"));
     }
 
-    public void testResolveAllGetAliasesRequestExpandWildcardsClosed() {
+    public void testResolveAllGetAliasesRequestExpandWildcardsOpenOnly() {
         GetAliasesRequest request = new GetAliasesRequest();
-        //set indices options to have wildcards resolved to open and closed indices (default is open only)
-        request.indicesOptions(IndicesOptions.fromOptions(true, false, true, true));
+        //set indices options to have wildcards resolved to open indices only (default is open and closed)
+        request.indicesOptions(IndicesOptions.fromOptions(true, false, true, false));
         //even if not set, empty means _all
         if (randomBoolean()) {
             request.indices("_all");
@@ -540,10 +540,10 @@
         request.aliases("alias1");
         Set<String> indices = defaultIndicesResolver.resolve(user, GetAliasesAction.NAME, request, metaData);
         //the union of all resolved indices and aliases gets returned
-        String[] expectedIndices = new String[]{"bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed", "alias1"};
+        String[] expectedIndices = new String[]{"bar", "foofoobar", "foofoo", "alias1"};
         assertThat(indices.size(), equalTo(expectedIndices.length));
         assertThat(indices, hasItems(expectedIndices));
-        String[] replacedIndices = new String[]{"bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed"};
+        String[] replacedIndices = new String[]{"bar", "foofoobar", "foofoo"};
         //_all gets replaced with all indices that user is authorized for
         assertThat(request.indices(), arrayContaining(replacedIndices));
         assertThat(request.aliases(), arrayContaining("alias1"));
@@ -585,7 +585,7 @@
         }
         Set<String> indices = defaultIndicesResolver.resolve(user, GetAliasesAction.NAME, request, metaData);
         //the union of all resolved indices and aliases gets returned
-        String[] expectedIndices = new String[]{"bar", "foofoobar", "foofoo"};
+        String[] expectedIndices = new String[]{"bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed"};
         assertThat(indices.size(), equalTo(expectedIndices.length));
         assertThat(indices, hasItems(expectedIndices));
         //_all gets replaced with all indices that user is authorized for
@@ -600,11 +600,11 @@
         }
         Set<String> indices = defaultIndicesResolver.resolve(user, GetAliasesAction.NAME, request, metaData);
         //the union of all resolved indices and aliases gets returned
-        String[] expectedIndices = new String[]{"bar", "foofoobar", "foofoo", "explicit"};
+        String[] expectedIndices = new String[]{"bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed", "explicit"};
         assertThat(indices.size(), equalTo(expectedIndices.length));
         assertThat(indices, hasItems(expectedIndices));
         //_all gets replaced with all indices that user is authorized for
-        assertThat(request.indices(), arrayContaining("bar", "foofoobar", "foofoo"));
+        assertThat(request.indices(), arrayContaining("bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed"));
         assertThat(request.aliases(), arrayContaining("foofoobar", "explicit"));
     }
 
@@ -615,7 +615,7 @@
         }
         Set<String> indices = defaultIndicesResolver.resolve(user, GetAliasesAction.NAME, request, metaData);
         //the union of all resolved indices and aliases gets returned
-        String[] expectedIndices = new String[]{"bar", "foofoobar", "foofoo"};
+        String[] expectedIndices = new String[]{"bar", "bar-closed", "foofoobar", "foofoo", "foofoo-closed"};
         assertThat(indices.size(), equalTo(expectedIndices.length));
         assertThat(indices, hasItems(expectedIndices));
         //_all gets replaced with all indices that user is authorized for
