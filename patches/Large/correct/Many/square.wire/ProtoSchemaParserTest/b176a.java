diff --git a/protoparser/src/test/java/com/squareup/protoparser/ProtoSchemaParserTest.java b/protoparser/src/test/java/com/squareup/protoparser/ProtoSchemaParserTest.java
index c4ceb5d..6e88f31 100644
--- a/protoparser/src/test/java/com/squareup/protoparser/ProtoSchemaParserTest.java
+++ b/protoparser/src/test/java/com/squareup/protoparser/ProtoSchemaParserTest.java
@@ -19,7 +19,7 @@
   private static final List<Type> NO_TYPES = Collections.emptyList();
   private static final List<Service> NO_SERVICES = Collections.emptyList();
   private static final List<String> NO_STRINGS = Collections.emptyList();
-  private static final List<ExtendDeclaration> NO_EXTEND_DECLARATIONs = Collections.emptyList();
+  private static final List<ExtendDeclaration> NO_EXTEND_DECLARATIONS = Collections.emptyList();
   private static final List<Extensions> NO_EXTENSIONS = Collections.emptyList();
   private static final List<Option> NO_OPTIONS = Collections.emptyList();
 
@@ -144,7 +144,7 @@
         NO_TYPES, NO_EXTENSIONS, NO_OPTIONS);
     ProtoFile protoFile =
         new ProtoFile("search.proto", null, NO_STRINGS, NO_STRINGS, Arrays.asList(expected),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("search.proto", new StringReader(proto))).isEqualTo(protoFile);
   }
 
@@ -168,7 +168,7 @@
             NO_OPTIONS), new Value("SYRUP", 3, "Quebec Maple syrup", NO_OPTIONS)));
     ProtoFile protoFile =
         new ProtoFile("waffles.proto", null, NO_STRINGS, NO_STRINGS, Arrays.asList(expected),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     ProtoFile actual = ProtoSchemaParser.parse("waffles.proto", proto);
     assertThat(actual).isEqualTo(protoFile);
   }
@@ -189,7 +189,7 @@
     ProtoFile expected =
         new ProtoFile("descriptor.proto", "google.protobuf", NO_STRINGS, NO_STRINGS,
             Arrays.asList(message), NO_SERVICES, map("java_package", "com.google.protobuf"),
-            NO_EXTEND_DECLARATIONs);
+            NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("descriptor.proto", proto))
         .isEqualTo(expected);
   }
@@ -216,7 +216,7 @@
             Arrays.asList(enumType), NO_EXTENSIONS, NO_OPTIONS);
     ProtoFile expected =
         new ProtoFile("descriptor.proto", null, NO_STRINGS, NO_STRINGS, Arrays.asList(messageType),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     ProtoFile actual = ProtoSchemaParser.parse("descriptor.proto", proto);
     assertThat(actual).isEqualTo(expected);
   }
@@ -225,7 +225,7 @@
     String proto = "import \"src/test/resources/unittest_import.proto\";\n";
     ProtoFile expected = new ProtoFile("descriptor.proto", null,
         Arrays.asList("src/test/resources/unittest_import.proto"), NO_STRINGS, NO_TYPES,
-        NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+        NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("descriptor.proto", proto))
         .isEqualTo(expected);
   }
@@ -234,7 +234,7 @@
     String proto = "import public \"src/test/resources/unittest_import.proto\";\n";
     ProtoFile expected = new ProtoFile("descriptor.proto", null,
         NO_STRINGS, Arrays.asList("src/test/resources/unittest_import.proto"), NO_TYPES,
-        NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+        NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("descriptor.proto", proto))
         .isEqualTo(expected);
   }
@@ -267,7 +267,7 @@
     Type messageType = new MessageType("Foo", "Foo", "", Arrays.asList(field), NO_TYPES,
         NO_EXTENSIONS, NO_OPTIONS);
     ProtoFile expected = new ProtoFile("descriptor.proto", null, NO_STRINGS, NO_STRINGS,
-        Arrays.<Type>asList(messageType), NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+        Arrays.<Type>asList(messageType), NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("descriptor.proto", proto))
         .isEqualTo(expected);
   }
@@ -289,7 +289,7 @@
             NO_TYPES, NO_EXTENSIONS, NO_OPTIONS);
     ProtoFile expected =
         new ProtoFile("foo.proto", null, NO_STRINGS, NO_STRINGS, Arrays.<Type>asList(messageType),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("foo.proto", proto))
         .isEqualTo(expected);
   }
@@ -322,7 +322,7 @@
         new Service.Method("Purchase", "", "PurchaseRequest", "PurchaseResponse",
             map("squareup.sake.timeout", "15", "squareup.a.b", map("value", list("FOO", "BAR"))))));
     ProtoFile protoFile = new ProtoFile("descriptor.proto", null, NO_STRINGS, NO_STRINGS, NO_TYPES,
-        Arrays.asList(expected), map(), NO_EXTEND_DECLARATIONs);
+        Arrays.asList(expected), map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("descriptor.proto", proto))
         .isEqualTo(protoFile);
   }
@@ -337,7 +337,7 @@
         NO_TYPES, NO_EXTENSIONS, NO_OPTIONS);
     ProtoFile protoFile =
         new ProtoFile("hex.proto", null, NO_STRINGS, NO_STRINGS, Arrays.asList(expected),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("hex.proto", proto)).isEqualTo(protoFile);
   }
 
@@ -383,7 +383,7 @@
             NO_TYPES, NO_EXTENSIONS, options);
     ProtoFile protoFile =
         new ProtoFile("exotic.proto", null, NO_STRINGS, NO_STRINGS, Arrays.asList(expected),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("exotic.proto", proto)).isEqualTo(protoFile);
   }
 
@@ -408,7 +408,7 @@
         Arrays.<MessageType.Field>asList(field), NO_TYPES, NO_EXTENSIONS, NO_OPTIONS);
     ProtoFile protoFile =
         new ProtoFile("nestedmaps.proto", null, NO_STRINGS, NO_STRINGS, Arrays.asList(expected),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("nestedmaps.proto", proto))
         .isEqualTo(protoFile);
   }
@@ -432,7 +432,7 @@
         NO_OPTIONS);
     ProtoFile protoFile =
         new ProtoFile("foo.proto", null, NO_STRINGS, NO_STRINGS, Arrays.asList(expected),
-            NO_SERVICES, map(), NO_EXTEND_DECLARATIONs);
+            NO_SERVICES, map(), NO_EXTEND_DECLARATIONS);
     assertThat(ProtoSchemaParser.parse("foo.proto", proto)).isEqualTo(protoFile);
   }
 
