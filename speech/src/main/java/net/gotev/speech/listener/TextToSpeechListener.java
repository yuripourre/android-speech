package net.gotev.speech.listener;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;

import net.gotev.speech.TextToSpeechCallback;

import java.util.Locale;

public interface TextToSpeechListener {

    void initTextToSpeech(Context context);

    void say(String message, TextToSpeechCallback callback);

    void stop();

    void shutdown();

    void setTextToSpeechQueueMode(int mode);

    void setAudioStream(int audioStream);

    void setOnInitListener(TextToSpeech.OnInitListener onInitListener);

    void setPitch(float pitch);

    void setSpeechRate(float rate);

    void setLocale(Locale locale);

    void setVoice(Voice voice);

}
