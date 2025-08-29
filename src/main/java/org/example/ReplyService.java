package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }
        String message2 = message.trim().toLowerCase();
        if (message2.equals("hi")) {
            if (type.equals(ReplyType.FORMAL)) {
                return "Hello. How may I assist you today?";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "Hey there! \uD83D\uDE0A How can I help?";
            } else if (type.equals(ReplyType.CONCISE)) {
                return "Hello. How can I help?";
            }
            return "m";
        }

        if (message2.equals("hello")) {
            if (type.equals(ReplyType.FORMAL)) {
                return "Hello. How may I assist you today?";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "Hi! \uD83D\uDC4B What’s up?";
            } else if (type.equals(ReplyType.CONCISE)) {
                return "Hello. How can I help?";
            }
            return "m";
        }
        if (message2.equals("how are you")) {
            if (type.equals(ReplyType.FORMAL)) {
                return "I am functioning properly. How may I assist you?";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "Doing great! \uD83D\uDE04 How can I help?";
            } else if (type.equals(ReplyType.CONCISE)) {
                return "I’m good. How can I help?";
            }
            return "m";
        }
        if (message2.equals("i need help")) {
            if (type.equals(ReplyType.FORMAL)) {
                return "I can assist with that. Please provide more details.";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "I’ve got you! \uD83D\uDE42 Tell me a bit more.";
            } else if (type.equals(ReplyType.CONCISE)) {
                return "Share details; I’ll help.";
            }
            return "m";
        }

        if (message2.equals("can you help me with my account")) {
            if (type.equals(ReplyType.FORMAL)) {
                return "Certainly. Please describe the account issue.";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "Sure thing! \uD83D\uDE0A What’s wrong with the account?";
            } else if (type.equals(ReplyType.CONCISE)) {
                return "Describe the account issue…";
            }
            return "m";
        }
        if (message2.equals("bye")) {
            if (type.equals(ReplyType.FORMAL) || type.equals(ReplyType.CONCISE)) {
                return "Goodbye.";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "See you later! \uD83D\uDC4B";
            }
            return "m";
        }

        if (message2.equals("thanks")) {
            if (type.equals(ReplyType.FORMAL)) {
                return "You are welcome.";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "Anytime! \uD83D\uDE4C";
            } else if (type.equals(ReplyType.CONCISE)) {
                return "You’re welcome.";
            }
            return "m";
        }

        if (message2.equals("what is your name")) {
            if (type.equals(ReplyType.FORMAL)) {
                return "I am your virtual assistant.";
            } else if (type.equals(ReplyType.FRIENDLY)) {
                return "I’m your helper bot \uD83E\uDD16";
            } else if (type.equals(ReplyType.CONCISE)) {
                return "I’m your assistant.";
            }
            return "m";
        }
        else {
            if (type.equals(ReplyType.FORMAL)) {
                return "Could you clarify your request?";
            }
            else if (type.equals(ReplyType.FRIENDLY)) {
                return "Could you tell me more?";
            }
            else if (type.equals(ReplyType.CONCISE)) {
                return "Please clarify.";
            }
            return "m";
        }


//        throw new UnsupportedOperationException("Not implemented yet");

    }

}

