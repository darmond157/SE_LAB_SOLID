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


### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>کلاس‌هایی که از Message ارث بری می‌کنند شامل EmailMessage و SmsMessage و TelegramMessage همگی یک وظیفه واحد دارند و آن نگهداری از اطلاعات پیام است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کارآیی اصلی برنامه شامل گرفتن ورودی و ساخت و ارسال پیام تنها در یک تابع main در کلاس Main قرار داده شده است.
<br/>
<br/>
در کلاس EmailMessageService توابع sendTelegramMessage و sendSmsMessage پیاده سازی شده است که ربطی به وظیفه اصلی کلاس ندارد.
<br/>
<br/>
در کلاس SmsMessageService توابع sendEmailMessage و sendTelegramMessage پیاده سازی شده است که ربطی به وظیفه اصلی کلاس ندارد.
<br/>
<br/>
در کلاس TelegramMessageService توابع sendSmsMessage و sendEmailMessage پیاده سازی شده است که ربطی به وظیفه اصلی کلاس ندارد.
</p>

</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>برای تحقق OCP از DIP استفاده می‌کنیم اما در اینجا DIP نقض شده است زیرا کلاس Main برای ارسال پیام به طور مستقیم با توابع مربوط به سرویس‌ها کار می‌کند به جای اینکه از واسط MessageService استفاده کند. به عبارت دیگر کلاس‌ها از طریق abstraction باید به یکدیگر وابسته باشند اما در اینجا این مورد رعایت نشده است. همچنین برای اضافه کردن یک کلاس سرویس جدید نیاز است یک تابع جدید در واسط MessageService تعریف کنیم که منجر به تغییر در تمام کلاس‌های سرویس موجود می‌شود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس‌های فرزند قابل جایگزین با کلاس پدر هستند. کلاس‌های EmailMessage و SmsMessage و TelegramMessage همگی می‌توانند جایگزین کلاس Message شوند و در اینجا refused bequest نداریم.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس‌های EmailMessageService و SmsMessageService و TelegramMessageService از واسط به نام MessageService استفاده می‌کنند و هر کدام توابعی را پیاده سازی می‌کنند که از آنها استفاده نمی‌کنند. برای مثال کلاس EmailMessageService باید توابع sendSmsMessage و sendEmailMessage را پیاده سازی کند در حالی که استفاده‌ای از آنها نمی‌کند.
<br/>
<br/>
در کلاس EmailMessageService توابع sendTelegramMessage و sendSmsMessage پیاده سازی شده است که استفاده‌ای از آنها نمی‌کند.
<br/>
<br/>
در کلاس SmsMessageService توابع sendEmailMessage و sendTelegramMessage پیاده سازی شده است که استفاده‌ای از آنها نمی‌کند.
<br/>
<br/>
در کلاس TelegramMessageService توابع sendSmsMessage و sendEmailMessage پیاده سازی شده است که استفاده‌ای از آنها نمی‌کند.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس‌ها باید از طریق abstraction به یکدیگر وابسته باشند نه به صورت مستقیم و از طریق concretion. اما در اینجا کلاس Main برای ارسال پیام به طور مستقیم با توابع مربوط به سرویس‌ها کار می‌کند به جای اینکه از واسط MessageService استفاده کند.</p>
</td>
</tr>
</tbody>
</table>

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>Single Responsibility</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>استفاده از سرویس های مربوطه در تابع main و سپردن کارهای گرفتن و ساخت و ارسال پیام به آنها
حذف توابع نامربوط از کلاس های نام برده و تغییر interface 
</p>
</td>
</tr>
<tr>
<td width="168">
<p>Open-Close Principle (OCP)</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>تغییر واسط به گونه ای که نیاز به تعریف یک تابع جدید در آن نباشیم و یک تابع داشته باشیم که برای همه قابل پیاده سازی باشد
استفاده از سرویس ها در کلاس main به جای دریافت و چاپ مستقیم
</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>تغییر در واسط MessageService که به تبع آن توابع بلااستفاده را حذف خواهیم کرد و اصلاح صورت میگیرد.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Dependency Inversion Principle</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>استفاده از واسط ها و توابع آن ها به جای استفاده مستقیم در main باعث بهبود این اصل میشود</p>
</td>
</tr>
</tbody>
</table>

### گام ۴: بررسی مجدد تغییرات مورد نیاز
<p>
  1.
7 – در سرویس مربوطه هندل میشود
2 و 3 و 1– نیازی به تعریف یک تابع جداگانه نیست چون واسط را بهبود بخشیدیم
  2.
  5 تای باقی مانده.
</p>

### گام ۵: جمع بندی
<p>
  اصول SOLID یک مجموعه اصول طراحی برنامه‌نویسی هستند که بهبود قابلیت توسعه، نگهداری و تغییرپذیری نرم‌افزارها را ترویج می‌دهند. رعایت این اصول دارای مزایای زیادی است نسبت به عدم رعایت آنها، این مزایا شامل:

1. **انعطاف‌پذیری**اصول SOLID باعث افزایش انعطاف‌پذیری در سیستم می‌شوند. این به معنی این است که باید بتوانید قطعات کد را به راحتی تغییر دهید بدون اینکه تغییرات در یک قسمت از کد، تاثیرات زنجیری در سایر قسمت‌های کد ایجاد کند.

2. **قابل‌فهمیت** رعایت اصول SOLID باعث می‌شود کد شفاف‌تر و قابل فهم‌تر شود. این به معنی این است که بقایل‌های جدید نیز به راحتی می‌توانند کد را درک کنند و تغییرات را اعمال کنند.

3. **تست‌پذیری** این اصول کمک می‌کنند تا کد قابلیت آزمون (تست) بهتری داشته باشد. با تقسیم منطق برنامه به قطعات کوچک‌تر و مستقل، آزمون واحد (Unit Testing) را بسیار آسان‌تر می‌کند.

4. **گسترش‌پذیری**با رعایت اصول SOLID، سیستم شما مقیاس‌پذیر‌تر خواهد بود و می‌توانید به راحتی قطعات جدید را اضافه کنید بدون تغییرات گسترده در کد قدیمی.

5. **کاهش تکرار کد** اصول SOLID کمک می‌کنند تا کد تکراری کاهش پیدا کند. این به معنی این است که منطق مشترک به صورت کد یکبار نوشته شده و استفاده می‌شود.

به طور کلی، رعایت اصول SOLID باعث می‌شود کد شما بهتر مدیریت شود، سازماندهی شود و گسترش یابد. این اصول به خوبی به شما کمک می‌کنند تا از مزایای توسعه‌پذیری، قابلیت نگهداری و کاهش هزینه‌های توسعه نرم‌افزار بهره‌مند شوید.
در این مراحلی که باهم طی کردیم نیز این مزایا مانند کاهش تکرار کد، گسترش پذیری و راحتی اضافه کردن قطعات و قابلیت فهم آسان تر و انعطاف پذیری و در نتیجه تست پذیری را به وضوح دیدیم و نتیجه آن ها را نیز باهم بررسی کردیم.

</p>
