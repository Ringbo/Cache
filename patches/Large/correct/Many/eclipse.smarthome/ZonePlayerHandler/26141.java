diff --git a/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/handler/ZonePlayerHandler.java b/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/handler/ZonePlayerHandler.java
index dd16bb4..463a1ba 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/handler/ZonePlayerHandler.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/handler/ZonePlayerHandler.java
@@ -252,7 +252,7 @@
                             getCoordinatorHandler().stop();
                         }
                     } catch (IllegalStateException e) {
-                        logger.warn("Cannot handle stop command ({})", e.getMessage());
+                        logger.debug("Cannot handle stop command ({})", e.getMessage());
                     }
                     break;
                 case VOLUME:
@@ -335,7 +335,7 @@
                             // Rewind and Fast Forward are currently not implemented by the binding
                         }
                     } catch (IllegalStateException e) {
-                        logger.warn("Cannot handle control command ({})", e.getMessage());
+                        logger.debug("Cannot handle control command ({})", e.getMessage());
                     }
                     break;
                 case SLEEPTIMER:
@@ -539,7 +539,7 @@
                         memberHandler.onValueReceived(variable, value, service);
                     }
                 } catch (IllegalStateException e) {
-                    logger.warn("Cannot update channel for group member ({})", e.getMessage());
+                    logger.debug("Cannot update channel for group member ({})", e.getMessage());
                 }
             }
         }
@@ -737,7 +737,7 @@
                         memberHandler.updateState(channeldD, state);
                     }
                 } catch (IllegalStateException e) {
-                    logger.warn("Cannot update channel for group member ({})", e.getMessage());
+                    logger.debug("Cannot update channel for group member ({})", e.getMessage());
                 }
             }
         } else if (ThingStatus.ONLINE.equals(getThing().getStatus()) && isLinked(channeldD)) {
@@ -769,7 +769,7 @@
         try {
             coordinatorHandler = getHandlerByName(getCoordinator());
         } catch (IllegalStateException e) {
-            logger.warn("Cannot update the group coordinator ({})", e.getMessage());
+            logger.debug("Cannot update the group coordinator ({})", e.getMessage());
             coordinatorHandler = null;
         }
     }
@@ -1085,7 +1085,7 @@
                     }
                 }
             } catch (IllegalStateException e) {
-                logger.warn("Cannot update media data for group member ({})", e.getMessage());
+                logger.debug("Cannot update media data for group member ({})", e.getMessage());
             }
         }
         if (needsUpdating && handlerForImageUpdate != null) {
@@ -1301,7 +1301,7 @@
         try {
             result = Long.valueOf(resultInput.get(requestedKey));
         } catch (NumberFormatException ex) {
-            logger.warn("Could not fetch {} result for type: {} and filter: {}. Using default value '0': {}",
+            logger.debug("Could not fetch {} result for type: {} and filter: {}. Using default value '0': {}",
                     requestedKey, entriesType, entriesFilter, ex.getMessage(), ex);
         }
 
@@ -1497,7 +1497,7 @@
             try {
                 getCoordinatorHandler().setVolume(command);
             } catch (IllegalStateException e) {
-                logger.warn("Cannot set group volume ({})", e.getMessage());
+                logger.debug("Cannot set group volume ({})", e.getMessage());
             }
         }
     }
@@ -1597,7 +1597,7 @@
                 inputs.put("DesiredFirstTrackNumberEnqueued", Long.toString(desiredFirstTrack));
                 inputs.put("EnqueueAsNext", Boolean.toString(enqueueAsNext));
             } catch (NumberFormatException ex) {
-                logger.error("Action Invalid Value Format Exception {}", ex.getMessage());
+                logger.debug("Action Invalid Value Format Exception {}", ex.getMessage());
             }
 
             Map<String, String> result = service.invokeAction(this, "AVTransport", "AddURIToQueue", inputs);
@@ -1621,7 +1621,7 @@
                 inputs.put("CurrentURI", URI);
                 inputs.put("CurrentURIMetaData", URIMetaData);
             } catch (NumberFormatException ex) {
-                logger.error("Action Invalid Value Format Exception {}", ex.getMessage());
+                logger.debug("Action Invalid Value Format Exception {}", ex.getMessage());
             }
 
             Map<String, String> result = service.invokeAction(this, "AVTransport", "SetAVTransportURI", inputs);
@@ -1653,7 +1653,7 @@
                 inputs.put("Unit", unit);
                 inputs.put("Target", target);
             } catch (NumberFormatException ex) {
-                logger.error("Action Invalid Value Format Exception {}", ex.getMessage());
+                logger.debug("Action Invalid Value Format Exception {}", ex.getMessage());
             }
 
             Map<String, String> result = service.invokeAction(this, "AVTransport", "Seek", inputs);
@@ -1725,7 +1725,7 @@
                     }
                 }
             } catch (IllegalStateException e) {
-                logger.warn("Cannot handle shuffle command ({})", e.getMessage());
+                logger.debug("Cannot handle shuffle command ({})", e.getMessage());
             }
         }
     }
@@ -1746,12 +1746,12 @@
                         coordinator.updatePlayMode(coordinator.isShuffleActive() ? "SHUFFLE_NOREPEAT" : "NORMAL");
                         break;
                     default:
-                        logger.warn("{}: unexpected repeat command; accepted values are ALL, ONE and OFF",
+                        logger.debug("{}: unexpected repeat command; accepted values are ALL, ONE and OFF",
                                 command.toString());
                         break;
                 }
             } catch (IllegalStateException e) {
-                logger.warn("Cannot handle repeat command ({})", e.getMessage());
+                logger.debug("Cannot handle repeat command ({})", e.getMessage());
             }
         }
     }
@@ -1841,10 +1841,10 @@
                     // start jammin'
                     coordinatorHandler.play();
                 } else {
-                    logger.warn("Line-in of {} is not connected", remoteHandler.getUDN());
+                    logger.debug("Line-in of {} is not connected", remoteHandler.getUDN());
                 }
             } catch (IllegalStateException e) {
-                logger.warn("Cannot play line-in ({})", e.getMessage());
+                logger.debug("Cannot play line-in ({})", e.getMessage());
             }
         }
     }
@@ -1976,7 +1976,7 @@
                     inputs.put("Enabled", "0");
                 }
             } catch (NumberFormatException ex) {
-                logger.error("Action Invalid Value Format Exception {}", ex.getMessage());
+                logger.debug("Action Invalid Value Format Exception {}", ex.getMessage());
             }
 
             Map<String, String> result = service.invokeAction(this, "AlarmClock", "UpdateAlarm", inputs);
@@ -2011,7 +2011,7 @@
         try {
             currentDateTime = fmt.parse(currentLocalTime);
         } catch (ParseException e) {
-            logger.error("An exception occurred while formatting a date", e);
+            logger.debug("An exception occurred while formatting a date", e);
         }
 
         if (currentDateTime != null) {
@@ -2030,7 +2030,7 @@
                 try {
                     durationDate = durationFormat.parse(anAlarm.getDuration());
                 } catch (ParseException e) {
-                    logger.error("An exception occurred while parsing a date : '{}'", e.getMessage());
+                    logger.debug("An exception occurred while parsing a date : '{}'", e.getMessage());
                     continue;
                 }
 
@@ -2080,7 +2080,7 @@
             try {
                 inputs.put("Duration", pFormatter.format(snoozePeriod.getTime()));
             } catch (NumberFormatException ex) {
-                logger.error("Action Invalid Value Format Exception {}", ex.getMessage());
+                logger.debug("Action Invalid Value Format Exception {}", ex.getMessage());
             }
 
             Map<String, String> result = service.invokeAction(this, "AVTransport", "SnoozeAlarm", inputs);
@@ -2089,7 +2089,7 @@
                 this.onValueReceived(variable, result.get(variable), "AVTransport");
             }
         } else {
-            logger.warn("There is no alarm running on {}", getUDN());
+            logger.debug("There is no alarm running on {}", getUDN());
         }
     }
 
@@ -2118,7 +2118,7 @@
             try {
                 getHandlerByName(command.toString()).setCurrentURI(entry);
             } catch (IllegalStateException e) {
-                logger.warn("Cannot add group member ({})", e.getMessage());
+                logger.debug("Cannot add group member ({})", e.getMessage());
             }
         }
     }
@@ -2145,7 +2145,7 @@
                             addMember(StringType.valueOf(somePlayer.getUDN()));
                         }
                     } catch (IllegalStateException e) {
-                        logger.warn("Cannot add to group ({})", e.getMessage());
+                        logger.debug("Cannot add to group ({})", e.getMessage());
                     }
                 }
             }
@@ -2162,11 +2162,11 @@
 
                 return true;
             } catch (IllegalStateException e) {
-                logger.warn("Cannot handle command ({})", e.getMessage());
+                logger.debug("Cannot handle command ({})", e.getMessage());
                 return false;
             }
         } else {
-            logger.warn("Line-in of {} is not connected", getUDN());
+            logger.debug("Line-in of {} is not connected", getUDN());
             return false;
         }
     }
@@ -2208,7 +2208,7 @@
                 // start jammin'
                 coordinator.play();
             } catch (IllegalStateException e) {
-                logger.warn("Cannot play URI ({})", e.getMessage());
+                logger.debug("Cannot play URI ({})", e.getMessage());
             }
         }
     }
@@ -2250,7 +2250,7 @@
                     notificationLock.notify();
                 }
             } catch (IllegalStateException e) {
-                logger.warn("Cannot play sound ({})", e.getMessage());
+                logger.debug("Cannot play sound ({})", e.getMessage());
             }
         }
     }
@@ -2429,7 +2429,7 @@
                     break;
                 }
             } catch (InterruptedException e) {
-                logger.error("InterruptedException during playing a notification sound");
+                logger.debug("InterruptedException during playing a notification sound");
             }
         }
     }
@@ -2444,7 +2444,7 @@
                         break;
                     }
                 } catch (InterruptedException e) {
-                    logger.error("InterruptedException during playing a notification sound");
+                    logger.debug("InterruptedException during playing a notification sound");
                 }
             }
         }
@@ -2460,7 +2460,7 @@
                         break;
                     }
                 } catch (InterruptedException e) {
-                    logger.error("InterruptedException during playing a notification sound");
+                    logger.debug("InterruptedException during playing a notification sound");
                 }
             }
         }
@@ -2499,7 +2499,7 @@
 
             coordinator.removeAllTracksFromQueue();
         } catch (IllegalStateException e) {
-            logger.warn("Cannot clear queue ({})", e.getMessage());
+            logger.debug("Cannot clear queue ({})", e.getMessage());
         }
     }
 
@@ -2516,7 +2516,7 @@
             // start jammin'
             coordinator.play();
         } catch (IllegalStateException e) {
-            logger.warn("Cannot play queue ({})", e.getMessage());
+            logger.debug("Cannot play queue ({})", e.getMessage());
         }
     }
 
@@ -2555,7 +2555,7 @@
                         QUEUE_URI + oldmemberHandler.getUDN() + "#0");
                 oldmemberHandler.setCurrentURI(entry);
             } catch (IllegalStateException e) {
-                logger.warn("Cannot remove group member ({})", e.getMessage());
+                logger.debug("Cannot remove group member ({})", e.getMessage());
             }
         }
     }
@@ -2597,10 +2597,10 @@
                     coordinator.setCurrentURI(theEntry);
                     coordinator.play();
                 } catch (IllegalStateException e) {
-                    logger.warn("Cannot play radio ({})", e.getMessage());
+                    logger.debug("Cannot play radio ({})", e.getMessage());
                 }
             } else {
-                logger.warn("Radio station '{}' not found", station);
+                logger.debug("Radio station '{}' not found", station);
             }
         }
     }
@@ -2632,10 +2632,10 @@
                     coordinator.setCurrentURI(entry);
                     coordinator.play();
                 } catch (IllegalStateException e) {
-                    logger.warn("Cannot play TuneIn station {} ({})", stationId, e.getMessage());
+                    logger.debug("Cannot play TuneIn station {} ({})", stationId, e.getMessage());
                 }
             } else {
-                logger.warn("TuneIn service not found");
+                logger.debug("TuneIn service not found");
             }
         }
     }
@@ -2723,10 +2723,10 @@
                     }
                     coordinator.play();
                 } catch (IllegalStateException e) {
-                    logger.warn("Cannot paly favorite ({})", e.getMessage());
+                    logger.debug("Cannot paly favorite ({})", e.getMessage());
                 }
             } else {
-                logger.warn("Favorite '{}' not found", favorite);
+                logger.debug("Favorite '{}' not found", favorite);
             }
         }
     }
@@ -2749,7 +2749,7 @@
                 // start jammin'
                 coordinator.play();
             } catch (IllegalStateException e) {
-                logger.warn("Cannot play track ({})", e.getMessage());
+                logger.debug("Cannot play track ({})", e.getMessage());
             }
         }
     }
@@ -2784,10 +2784,10 @@
 
                     coordinator.play();
                 } catch (IllegalStateException e) {
-                    logger.warn("Cannot play playlist ({})", e.getMessage());
+                    logger.debug("Cannot play playlist ({})", e.getMessage());
                 }
             } else {
-                logger.warn("Playlist '{}' not found", playlist);
+                logger.debug("Playlist '{}' not found", playlist);
             }
         }
     }
@@ -2905,7 +2905,7 @@
             long seconds = TimeUnit.SECONDS.toSeconds(remainingSeconds);
             return String.format("%02d:%02d:%02d", hours, minutes, seconds);
         } else {
-            logger.error("Sonos SleepTimer: Invalid sleep time set. sleep time must be >=0 and < 68400s (24h)");
+            logger.debug("Sonos SleepTimer: Invalid sleep time set. sleep time must be >=0 and < 68400s (24h)");
             return "ERR";
         }
     }
