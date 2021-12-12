diff --git a/src/main/java/com/fasterxml/jackson/databind/util/TokenBuffer.java b/src/main/java/com/fasterxml/jackson/databind/util/TokenBuffer.java
index ec429ae..4d69230 100644
--- a/src/main/java/com/fasterxml/jackson/databind/util/TokenBuffer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/util/TokenBuffer.java
@@ -147,7 +147,7 @@
     {
         _objectCodec = codec;
         _generatorFeatures = DEFAULT_GENERATOR_FEATURES;
-        _writeContext = JsonWriteContext.createRootContext();
+        _writeContext = JsonWriteContext.createRootContext(null);
         // at first we have just one segment
         _first = _last = new Segment();
         _appendOffset = 0;
@@ -164,7 +164,7 @@
     {
         _objectCodec = jp.getCodec();
         _generatorFeatures = DEFAULT_GENERATOR_FEATURES;
-        _writeContext = JsonWriteContext.createRootContext();
+        _writeContext = JsonWriteContext.createRootContext(null);
         // at first we have just one segment
         _first = _last = new Segment();
         _appendOffset = 0;
@@ -1109,7 +1109,7 @@
             _segment = firstSeg;
             _segmentPtr = -1; // not yet read
             _codec = codec;
-            _parsingContext = JsonReadContext.createRootContext(-1, -1);
+            _parsingContext = JsonReadContext.createRootContext(null);
             _hasNativeTypeIds = hasNativeTypeIds;
             _hasNativeObjectIds = hasNativeObjectIds;
             _hasNativeIds = (hasNativeTypeIds | hasNativeObjectIds);
@@ -1199,7 +1199,7 @@
                 _parsingContext = _parsingContext.getParent();
                 // but allow unbalanced cases too (more close markers)
                 if (_parsingContext == null) {
-                    _parsingContext = JsonReadContext.createRootContext(-1, -1);
+                    _parsingContext = JsonReadContext.createRootContext(null);
                 }
             }
             return _currToken;
