### گام ۱: افزودن یک روش پیام رسانی دیگر

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>1</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>SmsMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع با عنوان sendTelegramMessage</p></td>
</tr>

<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>EmailMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع با عنوان sendTelegramMessage</p></td>
</tr>

<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن کلاس برای ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک کلاس با عنوان TelegramMessageService که تابع sendTelegramMessage را پیاده سازی می‌کند</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن یک کلاس برای خود پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک کلاس با عنوان TelegramMessage که مقادیر آیدی مبدا و مقصد را دارد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن یک print برای اطلاع به کاربر</p>
</td>
<td width="292">
<p>افزودن یک خط print برای مطلع کردن کاربر از شماره‌ای که باید برای پیام تلگرامی وارد کند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن case مربوط به پیام تلگرامی در switch</p>
</td>
<td width="292">
<p>در switch case، کد مربوط به ورودی گرفتن آیدی مبدا و مقصد و پیام اضافه شد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>8</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>صدا زدن سرویس مربوط به پیام تلگرام</p>
</td>
<td width="292">
<p>برای ارسال پیام تلگرام، تابع مربوطه از کلاس TelegramMessageService را صدا می‌زنیم</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: 8