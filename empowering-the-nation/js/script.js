// Fees
const FEES = { sixMonth: 1500, sixWeek: 750 };

function calculateFees() {
  const type = document.querySelector('input[name="courseType"]:checked');
  const checkboxes = document.querySelectorAll('input[name="course"]:checked');
  const result = document.getElementById('calc-result');
  const error = document.getElementById('calc-error');
  if(!type) {
    error.textContent = 'Please select a course type (6-week or 6-month).';
    error.style.display = 'block';
    result.style.display = 'none';
    return;
  }
  if(checkboxes.length === 0) {
    error.textContent = 'Please select at least one course.';
    error.style.display = 'block';
    result.style.display = 'none';
    return;
  }
  error.style.display = 'none';
  let total = 0;
  checkboxes.forEach(cb => {
    total += (type.value === 'sixMonth') ? FEES.sixMonth : FEES.sixWeek;
  });
  result.textContent = 'Total Fees: R' + total;
  result.style.display = 'block';
}

function clearCalc() {
  document.querySelectorAll('input[name="course"]').forEach(i => i.checked = false);
  document.querySelectorAll('input[name="courseType"]').forEach(i => i.checked = false);
  document.getElementById('calc-result').style.display = 'none';
  document.getElementById('calc-error').style.display = 'none';
}

function goBack(fallback='index.html') {
  if(document.referrer) history.back();
  else window.location.href = fallback;
}

function submitContact(e) {
  e.preventDefault();
  const name = document.getElementById('c-name').value.trim();
  const email = document.getElementById('c-email').value.trim();
  const msg = document.getElementById('c-message').value.trim();
  const status = document.getElementById('contact-status');
  if(!name || !email || !msg) {
    status.textContent = 'Please fill all fields.';
    status.style.color = '#b00020';
    return;
  }
  status.textContent = 'Thanks — your message has been sent (demo).';
  status.style.color = '#0b7f4b';
  document.getElementById('contact-form').reset();
}