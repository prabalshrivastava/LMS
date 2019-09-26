<jsp:include page="common/head.jsp" />
<body>
    <div class="signup-form">
        <form action="" method="post" id="applyLeave-form">
            <h2>Leave</h2>
            <div class="form-group">
                <select class="form-control" name="leaveType" placeholder="Leave Type" required>
                    <option disabled selected>Select Leave Type</option>
                    <option>Paid Leave</option>
                    <option>Non paid Leave</option>
                    <option>Emergency Leave</option>
                    <option>Compoff Leave</option>
                </select>
            </div>
            <div class="form-group">
                <input type="text" class="form-control datepicker" name="fromDate" placeholder="From Date" required>
            </div>
            <div class="form-group">
                <input type="text" class="form-control datepicker" name="toDate" placeholder="To Date" required>
            </div>

            <div class="form-group">
                <select class="form-control" name="fromSession" placeholder="Select From Session" required>
                    <option disabled selected>Select From Session</option>
                    <option>Session 1</option>
                    <option>Session 2</option>
                </select>
            </div>
            <div class="form-group">
                <select class="form-control" name="toSession" placeholder="Select to Session" required>
                    <option disabled selected>Select To Session</option>
                    <option>Session 1</option>
                    <option>Session 2</option>
                </select>
            </div>

            <div class="form-group">
                <textarea class="form-control" name="reason" placeholder="Reason for Leave" required></textarea>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="concernedPerson" placeholder="Concerned Person" required>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="reportingTo" placeholder="Reporting To" required>
            </div>

            <div class="form-group">
                <button type="" class="btn btn-success btn-lg btn-block">Apply</button>
            </div>
        </form>
    </div>
</body>
</html>