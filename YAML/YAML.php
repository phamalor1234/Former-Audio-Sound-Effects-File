<?php
$title = "YAML AUDIO FILES";
$subtitle = "The Audio with YAML";
$note = "This audio with 200 ok present.";
$files = [
    "Audio 1" => "Format voice YAML demo 01.wav",
    "Audio 2" => "Format voice YAML demo 02.wav",
    "Audio 3" => "Format voice YAML demo 03.wav",
    "Audio 4" => "Format voice YAML demo 04.wav",
    "Audio 5" => "Format voice YAML demo 05.wav",
    "Audio 6" => "Format voice YAML demo 06.wav"
];

echo "Title: " . $title . "\n";
echo "Subtitle: " . $subtitle . "\n";
echo "Note: " . $note . "\n";

echo "Files:\n";
foreach ($files as $name => $format) {
    echo "- " . $name . ": " . $format . "\n";
}
?>
