diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/stats/RestIndicesStatsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/stats/RestIndicesStatsAction.java
index 19c433c..17c495e 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/stats/RestIndicesStatsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/stats/RestIndicesStatsAction.java
@@ -120,7 +120,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
@@ -157,7 +157,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -195,7 +195,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -239,7 +239,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -283,7 +283,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -320,7 +320,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -358,7 +358,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -396,7 +396,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -434,7 +434,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -472,7 +472,7 @@
                         response.toXContent(builder, request);
                         builder.endObject();
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
