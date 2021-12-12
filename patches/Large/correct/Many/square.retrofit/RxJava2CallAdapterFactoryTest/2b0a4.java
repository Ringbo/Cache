diff --git a/retrofit-adapters/rxjava2/src/test/java/retrofit2/adapter/rxjava2/RxJava2CallAdapterFactoryTest.java b/retrofit-adapters/rxjava2/src/test/java/retrofit2/adapter/rxjava2/RxJava2CallAdapterFactoryTest.java
index 5897161..dea046f 100644
--- a/retrofit-adapters/rxjava2/src/test/java/retrofit2/adapter/rxjava2/RxJava2CallAdapterFactoryTest.java
+++ b/retrofit-adapters/rxjava2/src/test/java/retrofit2/adapter/rxjava2/RxJava2CallAdapterFactoryTest.java
@@ -73,10 +73,10 @@
     assertThat(factory.get(sBodyClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type mBodyClass = new TypeToken<Maybe<String>>() {}.getType();
-    assertThat(factory.get(sBodyClass, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(mBodyClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type fBodyClass = new TypeToken<Flowable<String>>() {}.getType();
-    assertThat(factory.get(sBodyClass, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(fBodyClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
 
     Type oBodyWildcard = new TypeToken<Observable<? extends String>>() {}.getType();
@@ -86,10 +86,10 @@
     assertThat(factory.get(sBodyWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type mBodyWildcard = new TypeToken<Maybe<? extends String>>() {}.getType();
-    assertThat(factory.get(sBodyWildcard, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(mBodyWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type fBodyWildcard = new TypeToken<Flowable<? extends String>>() {}.getType();
-    assertThat(factory.get(sBodyWildcard, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(fBodyWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
 
     Type oBodyGeneric = new TypeToken<Observable<List<String>>>() {}.getType();
@@ -99,10 +99,10 @@
     assertThat(factory.get(sBodyGeneric, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(new TypeToken<List<String>>() {}.getType());
     Type mBodyGeneric = new TypeToken<Maybe<List<String>>>() {}.getType();
-    assertThat(factory.get(sBodyGeneric, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(mBodyGeneric, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(new TypeToken<List<String>>() {}.getType());
     Type fBodyGeneric = new TypeToken<Flowable<List<String>>>() {}.getType();
-    assertThat(factory.get(sBodyGeneric, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(fBodyGeneric, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(new TypeToken<List<String>>() {}.getType());
 
     Type oResponseClass = new TypeToken<Observable<Response<String>>>() {}.getType();
@@ -112,10 +112,10 @@
     assertThat(factory.get(sResponseClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type mResponseClass = new TypeToken<Maybe<Response<String>>>() {}.getType();
-    assertThat(factory.get(sResponseClass, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(mResponseClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type fResponseClass = new TypeToken<Flowable<Response<String>>>() {}.getType();
-    assertThat(factory.get(sResponseClass, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(fResponseClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
 
     Type oResponseWildcard = new TypeToken<Observable<Response<? extends String>>>() {}.getType();
@@ -125,10 +125,10 @@
     assertThat(factory.get(sResponseWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type mResponseWildcard = new TypeToken<Maybe<Response<? extends String>>>() {}.getType();
-    assertThat(factory.get(sResponseWildcard, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(mResponseWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type fResponseWildcard = new TypeToken<Flowable<Response<? extends String>>>() {}.getType();
-    assertThat(factory.get(sResponseWildcard, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(fResponseWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
 
     Type oResultClass = new TypeToken<Observable<Result<String>>>() {}.getType();
@@ -138,10 +138,10 @@
     assertThat(factory.get(sResultClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type mResultClass = new TypeToken<Maybe<Result<String>>>() {}.getType();
-    assertThat(factory.get(sResultClass, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(mResultClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type fResultClass = new TypeToken<Flowable<Result<String>>>() {}.getType();
-    assertThat(factory.get(sResultClass, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(fResultClass, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
 
     Type oResultWildcard = new TypeToken<Observable<Result<? extends String>>>() {}.getType();
@@ -151,10 +151,10 @@
     assertThat(factory.get(sResultWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type mResultWildcard = new TypeToken<Maybe<Result<? extends String>>>() {}.getType();
-    assertThat(factory.get(sResultWildcard, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(mResultWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
     Type fResultWildcard = new TypeToken<Flowable<Result<? extends String>>>() {}.getType();
-    assertThat(factory.get(sResultWildcard, NO_ANNOTATIONS, retrofit).responseType())
+    assertThat(factory.get(fResultWildcard, NO_ANNOTATIONS, retrofit).responseType())
         .isEqualTo(String.class);
   }
 
