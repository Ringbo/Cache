diff --git a/lucene/misc/src/java/org/apache/lucene/uninverting/FieldCacheImpl.java b/lucene/misc/src/java/org/apache/lucene/uninverting/FieldCacheImpl.java
index a4cb8b5..85c1bba 100644
--- a/lucene/misc/src/java/org/apache/lucene/uninverting/FieldCacheImpl.java
+++ b/lucene/misc/src/java/org/apache/lucene/uninverting/FieldCacheImpl.java
@@ -605,7 +605,7 @@
     
     @Override
     public Collection<Accountable> getChildResources() {
-      List<Accountable> resources = new ArrayList<>();
+      List<Accountable> resources = new ArrayList<>(3);
       resources.add(Accountables.namedAccountable("term bytes", bytes));
       resources.add(Accountables.namedAccountable("ord -> term", termOrdToBytesOffset));
       resources.add(Accountables.namedAccountable("doc -> ord", docToTermOrd));
@@ -730,7 +730,7 @@
       return new BinaryDocValues() {
         @Override
         public BytesRef get(int docID) {
-          final int pointer = (int) docToOffset.get(docID);
+          final long pointer = docToOffset.get(docID);
           if (pointer == 0) {
             term.length = 0;
           } else {
@@ -748,7 +748,7 @@
 
     @Override
     public Collection<Accountable> getChildResources() {
-      List<Accountable> resources = new ArrayList<>();
+      List<Accountable> resources = new ArrayList<>(2);
       resources.add(Accountables.namedAccountable("term bytes", bytes));
       resources.add(Accountables.namedAccountable("addresses", docToOffset));
       return Collections.unmodifiableList(resources);
