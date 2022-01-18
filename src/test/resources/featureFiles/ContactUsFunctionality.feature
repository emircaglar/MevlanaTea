Feature: The form on the Contact Us page can be filled

  Scenario Outline:Fill the form properly

    Given Click on the Kontakt button
    When Type in the Name input "<Name>"
    And Type in the Email input "<Email>"
    And Type in the Subject input "<Subject>"
    And Type in the Description input "<Description>"
    And Click on the Senden Button
    Then "<MessageDE>" ,"<MessageTR>","<MessageEN>"should be verify

    Examples:
      | Name   | Email            | Subject | Description                     | MessageDE                                                                                 | MessageTR                                                                       | MessageEN                                                     |
      | Sukran | sukran@gmail.com | Kargo   | Wie viel Tage dauert das Kargo? | Vielen Dank für deine Mitteilung. Sie wurde versandt.                                     | Mesajınız için teşekkürler. Gönderildi.                                         | Thank you for your message. It has been sent.                 |
      |        | sukran@gmail.com | Kargo   | Wie viel Tage dauert das Kargo? | Ein oder mehrere Felder sind fehlerhaft. Bitte überprüfe sie und versuche es noch einmal. | Bir veya daha fazla alanda hata bulundu. Lütfen kontrol edin ve tekrar deneyin. | One or more fields have an error. Please check and try again. |
      | Sukran |                  | Kargo   | Wie viel Tage dauert das Kargo? | Ein oder mehrere Felder sind fehlerhaft. Bitte überprüfe sie und versuche es noch einmal. | Bir veya daha fazla alanda hata bulundu. Lütfen kontrol edin ve tekrar deneyin. | One or more fields have an error. Please check and try again. |
      | Sukran | sukran@gmail.com |         | Wie viel Tage dauert das Kargo? | Vielen Dank für deine Mitteilung. Sie wurde versandt.                                     | Mesajınız için teşekkürler. Gönderildi.                                         | Thank you for your message. It has been sent.                 |
      | Sukran | sukran@gmail.com | Kargo   |                                 | Vielen Dank für deine Mitteilung. Sie wurde versandt.                                     | Mesajınız için teşekkürler. Gönderildi.                                         | Thank you for your message. It has been sent.                 |


