#!/usr/bin/env bash
set -ex

./gradlew runAffectedUnitTests -Paffected_module_detector.enable

head -20 affected_module_detector.log
tail -20 affected_module_detector.log
rm -rf affected_module_detector.log