diff --git a/truffle/com.oracle.truffle.object.dsl.processor/src/com/oracle/truffle/object/dsl/processor/layout/LayoutGenerator.java b/truffle/com.oracle.truffle.object.dsl.processor/src/com/oracle/truffle/object/dsl/processor/layout/LayoutGenerator.java
index 44784c8..eca69b0 100644
--- a/truffle/com.oracle.truffle.object.dsl.processor/src/com/oracle/truffle/object/dsl/processor/layout/LayoutGenerator.java
+++ b/truffle/com.oracle.truffle.object.dsl.processor/src/com/oracle/truffle/object/dsl/processor/layout/LayoutGenerator.java
@@ -653,14 +653,15 @@
 
                     if (property.isVolatile()) {
                         if (property.getType().getKind() == TypeKind.INT) {
-                            stream.printf("        return ((AtomicInteger) %s_PROPERTY.get(object, true)).get();%n", NameUtils.identifierToConstant(property.getName()));
+                            stream.printf("        return ((AtomicInteger) %s_PROPERTY.get(object, is%s(object))).get();%n", NameUtils.identifierToConstant(property.getName()), layout.getName());
                         } else if (property.getType().getKind() == TypeKind.BOOLEAN) {
-                            stream.printf("        return ((AtomicBoolean) %s_PROPERTY.get(object, true)).get();%n", NameUtils.identifierToConstant(property.getName()));
+                            stream.printf("        return ((AtomicBoolean) %s_PROPERTY.get(object, is%s(object))).get();%n", NameUtils.identifierToConstant(property.getName()), layout.getName());
                         } else {
-                            stream.printf("        return ((AtomicReference<%s>) %s_PROPERTY.get(object, true)).get();%n", property.getType(), NameUtils.identifierToConstant(property.getName()));
+                            stream.printf("        return ((AtomicReference<%s>) %s_PROPERTY.get(object, is%s(object))).get();%n", property.getType(),
+                                            NameUtils.identifierToConstant(property.getName()), layout.getName());
                         }
                     } else {
-                        stream.printf("        return (%s) %s_PROPERTY.get(object, true);%n", property.getType(), NameUtils.identifierToConstant(property.getName()));
+                        stream.printf("        return (%s) %s_PROPERTY.get(object, is%s(object));%n", property.getType(), NameUtils.identifierToConstant(property.getName()), layout.getName());
                     }
                 }
 
@@ -716,11 +717,12 @@
                         stream.printf("        %s_PROPERTY.setInternal(object, value);%n", NameUtils.identifierToConstant(property.getName()));
                     } else if (property.isVolatile()) {
                         if (property.getType().getKind() == TypeKind.INT) {
-                            stream.printf("        ((AtomicInteger) %s_PROPERTY.get(object, true)).set(value);%n", NameUtils.identifierToConstant(property.getName()));
+                            stream.printf("        ((AtomicInteger) %s_PROPERTY.get(object, is%s(object))).set(value);%n", NameUtils.identifierToConstant(property.getName()), layout.getName());
                         } else if (property.getType().getKind() == TypeKind.BOOLEAN) {
-                            stream.printf("        ((AtomicBoolean) %s_PROPERTY.get(object, true)).set(value);%n", NameUtils.identifierToConstant(property.getName()));
+                            stream.printf("        ((AtomicBoolean) %s_PROPERTY.get(object, is%s(object))).set(value);%n", NameUtils.identifierToConstant(property.getName()), layout.getName());
                         } else {
-                            stream.printf("        ((AtomicReference<%s>) %s_PROPERTY.get(object, true)).set(value);%n", property.getType(), NameUtils.identifierToConstant(property.getName()));
+                            stream.printf("        ((AtomicReference<%s>) %s_PROPERTY.get(object, is%s(object))).set(value);%n", property.getType(), NameUtils.identifierToConstant(property.getName()),
+                                            layout.getName());
                         }
                     } else {
                         stream.printf("        try {%n");
@@ -753,17 +755,17 @@
 
                 if (property.getType().getKind() == TypeKind.INT) {
                     stream.printf(
-                                    "        return ((AtomicInteger) %s_PROPERTY.get(object, true)).compareAndSet(expected_value, value);%n",
-                                    NameUtils.identifierToConstant(property.getName()));
+                                    "        return ((AtomicInteger) %s_PROPERTY.get(object, is%s(object))).compareAndSet(expected_value, value);%n",
+                                    NameUtils.identifierToConstant(property.getName()), layout.getName());
                 } else if (property.getType().getKind() == TypeKind.BOOLEAN) {
                     stream.printf(
-                                    "        return ((AtomicBoolean) %s_PROPERTY.get(object, true)).compareAndSet(expected_value, value);%n",
-                                    NameUtils.identifierToConstant(property.getName()));
+                                    "        return ((AtomicBoolean) %s_PROPERTY.get(object, is%s(object))).compareAndSet(expected_value, value);%n",
+                                    NameUtils.identifierToConstant(property.getName()), layout.getName());
                 } else {
                     stream.printf(
-                                    "        return ((AtomicReference<%s>) %s_PROPERTY.get(object, true)).compareAndSet(expected_value, value);%n",
+                                    "        return ((AtomicReference<%s>) %s_PROPERTY.get(object, is%s(object))).compareAndSet(expected_value, value);%n",
                                     property.getType(),
-                                    NameUtils.identifierToConstant(property.getName()));
+                                    NameUtils.identifierToConstant(property.getName()), layout.getName());
                 }
 
                 stream.println("    }");
@@ -788,17 +790,17 @@
 
                 if (property.getType().getKind() == TypeKind.INT) {
                     stream.printf(
-                                    "        return ((AtomicInteger) %s_PROPERTY.get(object, true)).getAndSet(value);%n",
-                                    NameUtils.identifierToConstant(property.getName()));
+                                    "        return ((AtomicInteger) %s_PROPERTY.get(object, is%s(object))).getAndSet(value);%n",
+                                    NameUtils.identifierToConstant(property.getName()), layout.getName());
                 } else if (property.getType().getKind() == TypeKind.BOOLEAN) {
                     stream.printf(
-                                    "        return ((AtomicBoolean) %s_PROPERTY.get(object, true)).getAndSet(value);%n",
-                                    NameUtils.identifierToConstant(property.getName()));
+                                    "        return ((AtomicBoolean) %s_PROPERTY.get(object, is%s(object))).getAndSet(value);%n",
+                                    NameUtils.identifierToConstant(property.getName()), layout.getName());
                 } else {
                     stream.printf(
-                                    "        return ((AtomicReference<%s>) %s_PROPERTY.get(object, true)).getAndSet(value);%n",
+                                    "        return ((AtomicReference<%s>) %s_PROPERTY.get(object, is%s(object))).getAndSet(value);%n",
                                     property.getType(),
-                                    NameUtils.identifierToConstant(property.getName()));
+                                    NameUtils.identifierToConstant(property.getName()), layout.getName());
                 }
 
                 stream.println("    }");
