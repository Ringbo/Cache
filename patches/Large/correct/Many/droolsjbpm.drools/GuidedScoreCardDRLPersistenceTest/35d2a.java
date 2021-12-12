diff --git a/drools-workbench-models/drools-workbench-models-guided-scorecard/src/test/java/org/drools/workbench/models/guided/scorecard/backend/GuidedScoreCardDRLPersistenceTest.java b/drools-workbench-models/drools-workbench-models-guided-scorecard/src/test/java/org/drools/workbench/models/guided/scorecard/backend/GuidedScoreCardDRLPersistenceTest.java
index e338f49..b0cd263 100644
--- a/drools-workbench-models/drools-workbench-models-guided-scorecard/src/test/java/org/drools/workbench/models/guided/scorecard/backend/GuidedScoreCardDRLPersistenceTest.java
+++ b/drools-workbench-models/drools-workbench-models-guided-scorecard/src/test/java/org/drools/workbench/models/guided/scorecard/backend/GuidedScoreCardDRLPersistenceTest.java
@@ -38,7 +38,7 @@
                       StringUtil.countMatches( drl,
                                                "rule \"" ) );
 
-        assertEquals( 2,
+        assertEquals( 3,
                       StringUtil.countMatches( drl,
                                                "import " ) );
     }
@@ -57,7 +57,7 @@
                       StringUtil.countMatches( drl,
                                                "rule \"" ) );
 
-        assertEquals( 2,
+        assertEquals( 3,
                       StringUtil.countMatches( drl,
                                                "import " ) );
     }
@@ -76,7 +76,7 @@
                       StringUtil.countMatches( drl,
                                                "rule \"" ) );
 
-        assertEquals( 2,
+        assertEquals( 3,
                       StringUtil.countMatches( drl,
                                                "import " ) );
     }
@@ -96,7 +96,7 @@
                       StringUtil.countMatches( drl,
                                                "rule \"" ) );
 
-        assertEquals( 3,
+        assertEquals( 4,
                       StringUtil.countMatches( drl,
                                                "import " ) );
     }
@@ -117,7 +117,7 @@
                       StringUtil.countMatches( drl,
                                                "rule \"" ) );
 
-        assertEquals( 3,
+        assertEquals( 4,
                       StringUtil.countMatches( drl,
                                                "import " ) );
     }
@@ -138,7 +138,7 @@
                       StringUtil.countMatches( drl,
                                                "rule \"" ) );
 
-        assertEquals( 3,
+        assertEquals( 4,
                       StringUtil.countMatches( drl,
                                                "import " ) );
     }
